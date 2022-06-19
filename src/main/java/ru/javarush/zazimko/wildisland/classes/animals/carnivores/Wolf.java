package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import ru.javarush.zazimko.wildisland.classes.animals.herbivores.Herbivores;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Wolf extends Carnivore{
    public Wolf() {
        this.setName("Wolf " + this.getId());
        this.setIcon(WOLF_ICON);
        this.setWeight(WOLF_WEIGHT);
        this.setSpeed(WOLF_SPEED);
        this.setSatiety(WOLF_SATIETY);
        this.setMaxValueOfEntity(WOLF_MAX_VALUE);
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
