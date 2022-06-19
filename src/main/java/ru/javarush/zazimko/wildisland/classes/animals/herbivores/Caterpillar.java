package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Caterpillar extends Herbivores{
    public Caterpillar() {
        this.setName("Caterpillar " + this.getId());
        this.setIcon(CATERPILLAR_ICON);
        this.setWeight(CATERPILLAR_WEIGHT);
        this.setSpeed(CATERPILLAR_SPEED);
        this.setSatiety(CATERPILLAR_SATIETY);
        this.setMaxValueOfEntity(CATERPILLAR_MAX_VALUE);
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
