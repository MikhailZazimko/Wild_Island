package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import ru.javarush.zazimko.wildisland.classes.animals.herbivores.Herbivores;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Eagle extends Carnivore{


    public Eagle() {
        this.setName("Eagle " + this.getId());
        this.setIcon(EAGLE_ICON);
        this.setWeight(EAGLE_WEIGHT);
        this.setSpeed(EAGLE_SPEED);
        this.setSatiety(EAGLE_SATIETY);
        this.setMaxValueOfEntity(EAGLE_MAX_VALUE);
    }

    @Override
    public void toDie() {

    }

    @Override
    public void toEat(Herbivores herbivore) {

    }

    @Override
    public void toMove() {

    }

    @Override
    public void toMultiply(Carnivore carnivore) {

    }
}
