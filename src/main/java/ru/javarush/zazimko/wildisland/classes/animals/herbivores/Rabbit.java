package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Rabbit extends Herbivores{
    public Rabbit() {
        this.setName("Rabbit " + this.getId());
        this.setIcon(RABBIT_ICON);
        this.setWeight(RABBIT_WEIGHT);
        this.setSpeed(RABBIT_SPEED);
        this.setSatiety(RABBIT_SATIETY);
        this.setMaxValueOfEntity(RABBIT_MAX_VALUE);
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
