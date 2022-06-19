package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import ru.javarush.zazimko.wildisland.classes.animals.herbivores.Herbivores;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Fox extends Carnivore{
    public Fox() {
        this.setName("Fox " + this.getId());
        this.setIcon(FOX_ICON);
        this.setWeight(FOX_WEIGHT);
        this.setSpeed(FOX_SPEED);
        this.setSatiety(FOX_SATIETY);
        this.setMaxValueOfEntity(FOX_MAX_VALUE);
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
