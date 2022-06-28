package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;
import ru.javarush.zazimko.wildisland.gameField.Cell;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Buffalo extends Herbivores{
    public Buffalo() {
        this.setName("Buffalo " + this.getId());
        this.setIcon(BUFFALO_ICON);
        this.setWeight(BUFFALO_WEIGHT);
        this.setSpeed(BUFFALO_SPEED);
        this.setSatiety(BUFFALO_SATIETY);
        this.setMaxValueOfEntity(BUFFALO_MAX_VALUE);

    }
}
