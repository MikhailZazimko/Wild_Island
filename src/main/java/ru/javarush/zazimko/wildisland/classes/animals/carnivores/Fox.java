package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import ru.javarush.zazimko.wildisland.classes.animals.herbivores.*;
import ru.javarush.zazimko.wildisland.gameField.Cell;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Fox extends Carnivore{
    ConcurrentHashMap<Type, Integer> initializedRation;

    public Fox() {
        this.setName("Fox " + this.getId());
        this.setIcon(FOX_ICON);
        this.setWeight(FOX_WEIGHT);
        this.setSpeed(FOX_SPEED);
        this.setSatiety(FOX_SATIETY);
        this.setMaxValueOfEntity(FOX_MAX_VALUE);
        this.setMaxWeight(FOX_WEIGHT);
        this.initializedRation=initializedRation();
    }

    private ConcurrentHashMap<Type, Integer> initializedRation() {
        ConcurrentHashMap<Type, Integer> eat = new ConcurrentHashMap<>();
        eat.put(Rabbit.class, 70);
        eat.put(Mouse.class, 90);
        eat.put(Duck.class, 60);
        eat.put(Caterpillar.class, 40);
        return eat;
    }
}
