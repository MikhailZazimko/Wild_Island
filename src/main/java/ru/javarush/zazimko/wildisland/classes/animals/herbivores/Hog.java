package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Hog extends Herbivores{
    public Hog() {
        this.setName("Hog " + this.getId());
        this.setIcon(HOG_ICON);
        this.setWeight(HOG_WEIGHT);
        this.setSpeed(HOG_SPEED);
        this.setSatiety(HOG_SATIETY);
        this.setMaxValueOfEntity(HOG_MAX_VALUE);
    }

    @Override
    public void toDie() {

    }

    @Override
    public void toEat(Plant plant) {

    }

    @Override
    public void toMove() {

    }

    @Override
    public void toMultiply(Herbivores herbivore) {

    }
}
