package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Goat extends Herbivores{
    public Goat() {
        this.setName("Goat " + this.getId());
        this.setIcon(GOAT_ICON);
        this.setWeight(GOAT_WEIGHT);
        this.setSpeed(GOAT_SPEED);
        this.setSatiety(GOAT_SATIETY);
        this.setMaxValueOfEntity(GOAT_MAX_VALUE);
    }
}
