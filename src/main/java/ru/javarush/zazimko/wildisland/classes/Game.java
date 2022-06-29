package ru.javarush.zazimko.wildisland.classes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.javarush.zazimko.wildisland.classes.animals.Organism;
import ru.javarush.zazimko.wildisland.classes.plants.Plant;
import ru.javarush.zazimko.wildisland.classes.util.Factory;
import ru.javarush.zazimko.wildisland.classes.util.Randoms;
import ru.javarush.zazimko.wildisland.gameField.Cell;
import ru.javarush.zazimko.wildisland.gameField.Field;
import ru.javarush.zazimko.wildisland.modificators.Config;
import ru.javarush.zazimko.wildisland.view.View;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static ru.javarush.zazimko.wildisland.modificators.Config.INITIAL_VALUE;

//  Заполенеие рандомной ячейки заложенными в конфиг типами животных
@Getter
@RequiredArgsConstructor
public class Game {
    private final Field field;
    private final Factory factory;
    private final View view;


    public Game(Factory factory, View view, Field field) {
        this.field = field;
        //javax.swing.SwingUtilities.invokeLater(field);
        this.factory = factory;
        this.view = view;
        initField();
        initPlant();
    }

    public void initField() {
        int strRnd = Randoms.getRnd(0, Config.WIDTH - 1);
        int colRnd = Randoms.getRnd(0, Config.HEIGHT - 1);
        Cell[][] cells = field.getCells();
        cells[strRnd][colRnd].setOrganisms(factory.createAnimals());


    }

    public void initPlant() {
        Cell[][] cells = field.getCells();
        for (int i = 0; i < Config.WIDTH; i++) {
            for (int j = 0; j < Config.HEIGHT; j++) {
                ConcurrentHashMap<Type, Set<Organism>> organisms = cells[i][j].getOrganisms();
                Set<Organism> organismHashSet = new HashSet<>();
                organismHashSet.add(new Plant());
                organisms.put(Plant.class, organismHashSet);
            }
            for (int row = 0; row < cells.length; row++) {
                for (int col = 0; col < cells[row].length; col++) {
                    cells[row][col].updateNextCell(field, row, col);
                }
            }
        }
    }
}

