package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import lombok.Getter;
import ru.javarush.zazimko.wildisland.classes.animals.herbivores.*;

import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;
@Getter
public class Bear extends Carnivore {
    public ConcurrentHashMap<Type, Integer> initializedRation;

    @SuppressWarnings("unused")
    public Bear() {
        this.setName("Bear " + this.getId());
        this.setIcon(BEAR_ICON);
        this.setWeight(BEAR_WEIGHT);
        this.setSpeed(BEAR_SPEED);
        this.setSatiety(BEAR_SATIETY);
        this.setMaxValueOfEntity(BEAR_MAX_VALUE);
        this.setMaxWeight(BEAR_WEIGHT);
        this.initializedRation= initializedRation();
    }
    private ConcurrentHashMap<Type, Integer> initializedRation() {
        ConcurrentHashMap<Type, Integer> eat=new ConcurrentHashMap<>();
        eat.put(Snake.class, 80);
        eat.put(Horse.class, 40);
        eat.put(Deer.class, 80);
        eat.put(Rabbit.class, 80);
        eat.put(Mouse.class, 90);
        eat.put(Goat.class, 70);
        eat.put(Sheep.class, 70);
        eat.put(Hog.class, 50);
        eat.put(Buffalo.class, 20);
        eat.put(Duck.class, 10);
        return eat;
    }
}

