package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import ru.javarush.zazimko.wildisland.classes.animals.herbivores.Herbivores;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Bear extends Carnivore {
    public Bear() {
        this.setName("Bear " + this.getId());
        this.setIcon(BEAR_ICON);
        this.setWeight(BEAR_WEIGHT);
        this.setSpeed(BEAR_SPEED);
        this.setSatiety(BEAR_SATIETY);
        this.setMaxValueOfEntity(BEAR_MAX_VALUE);
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

