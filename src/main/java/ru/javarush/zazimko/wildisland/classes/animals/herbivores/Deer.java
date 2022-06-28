package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Deer extends Herbivores{
    public Deer() {
        this.setName("Deer " + this.getId());
        this.setIcon(DEER_ICON);
        this.setWeight(DEER_WEIGHT);
        this.setSpeed(DEER_SPEED);
        this.setSatiety(DEER_SATIETY);
        this.setMaxValueOfEntity(DEER_MAX_VALUE);
    }
}
