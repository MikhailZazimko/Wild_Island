package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;

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
