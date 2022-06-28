package ru.javarush.zazimko.wildisland.services;

import lombok.SneakyThrows;
import ru.javarush.zazimko.wildisland.classes.Game;
import ru.javarush.zazimko.wildisland.gameField.Cell;
import ru.javarush.zazimko.wildisland.gameField.Field;
import ru.javarush.zazimko.wildisland.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameWorker extends Thread {
    public static final int CORE_POOL_SIZE = 4;
    private final Game game;
    private static final int PERIOD = 1000;

    public GameWorker(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        View view = game.getView();
        //view.showStatistics();
        Field field = new Field();
        field.initCells();
        game.initField();
        game.initPlant();

        // SwingUtilities.invokeLater(field);

        ScheduledExecutorService mainPool = Executors.newScheduledThreadPool(CORE_POOL_SIZE);
        List<Cell[]> arrayCells = new ArrayList<>();
        Cell[][] cells = field.getCells();
        Collections.addAll(arrayCells, cells);
        List<AnimalsWorker> workers = arrayCells.stream()
                .map(o -> new AnimalsWorker(field))
                .toList();

        mainPool.scheduleWithFixedDelay(() -> runWorkers(view, workers)
                , PERIOD, PERIOD, TimeUnit.MILLISECONDS);
    }

    private void runWorkers(View view, List<AnimalsWorker> workers) {
        ExecutorService servicePool = Executors.newFixedThreadPool(CORE_POOL_SIZE);
        workers.forEach(servicePool::submit);
        servicePool.shutdown();
        awaitPool(view, servicePool);
    }

    @SneakyThrows
    private void awaitPool(View view, ExecutorService servicePool) {
        if (servicePool.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS)) {
            view.showStatistics();
        }

    }
}

