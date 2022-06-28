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


    public Game(Factory factory, View view) {
        this.field = new Field();
        //javax.swing.SwingUtilities.invokeLater(field);
        this.factory = factory;
        this.view=view;
    }

    public void initField() {
        int strRnd = Randoms.getRnd(0, Config.WIDTH);
        int colRnd = Randoms.getRnd(0, Config.HEIGHT);
        Cell[][] cells = field.getCells();
        cells[strRnd][colRnd].setOrganisms(factory.createAnimals());

    }

    public void initPlant() {
        int strRnd = Randoms.getRnd(0, Config.WIDTH);
        int colRnd = Randoms.getRnd(0, Config.HEIGHT);
        Cell[][] cells = field.getCells();
        for (int i = 0; i < Randoms.getRnd(0, Config.HEIGHT * Config.WIDTH); i++) {
            ConcurrentHashMap<Type, Set<Organism>> organisms = cells[strRnd][colRnd].getOrganisms();
            Set<Organism> organismHashSet = new HashSet<>();
            for (int j = 0; j < Randoms.getRnd(0, INITIAL_VALUE); j++) {
                organismHashSet.add(new Plant());
            }
            organisms.put(Plant.class, organismHashSet);
        }
    }
}

