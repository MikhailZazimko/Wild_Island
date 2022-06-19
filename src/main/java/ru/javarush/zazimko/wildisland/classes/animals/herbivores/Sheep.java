package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Sheep extends Herbivores{
    public Sheep() {
        this.setName("Sheep " + this.getId());
        this.setIcon(SHEEP_ICON);
        this.setWeight(SHEEP_WEIGHT);
        this.setSpeed(SHEEP_SPEED);
        this.setSatiety(SHEEP_SATIETY);
        this.setMaxValueOfEntity(SHEEP_MAX_VALUE);
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
