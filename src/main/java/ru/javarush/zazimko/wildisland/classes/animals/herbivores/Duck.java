package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Duck extends Herbivores{
    public Duck() {
        this.setName("Duck " + this.getId());
        this.setIcon(DUCK_ICON);
        this.setWeight(DUCK_WEIGHT);
        this.setSpeed(DUCK_SPEED);
        this.setSatiety(DUCK_SATIETY);
        this.setMaxValueOfEntity(DUCK_MAX_VALUE);
    }

    @Override
    public void toDie() {

    }

    @Override
    public void toEat(Plant plant) {

    }
    public void toEat(Caterpillar caterpillar){

    }

    @Override
    public void toMove() {

    }

    @Override
    public void toMultiply(Herbivores herbivore) {

    }
}
