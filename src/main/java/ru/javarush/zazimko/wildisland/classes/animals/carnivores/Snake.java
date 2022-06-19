package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import ru.javarush.zazimko.wildisland.classes.animals.herbivores.Herbivores;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Snake extends Carnivore{
    public Snake() {
        this.setName("Snake " + this.getId());
        this.setIcon(SNAKE_ICON);
        this.setWeight(SNAKE_WEIGHT);
        this.setSpeed(SNAKE_SPEED);
        this.setSatiety(SNAKE_SATIETY);
        this.setMaxValueOfEntity(SNAKE_MAX_VALUE);
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
