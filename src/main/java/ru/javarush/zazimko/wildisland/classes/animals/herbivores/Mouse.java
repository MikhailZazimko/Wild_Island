package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.plants.Plant;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

public class Mouse extends Herbivores{
    public Mouse() {
        this.setName("Mouse " + this.getId());
        this.setIcon(MOUSE_ICON);
        this.setWeight(MOUSE_WEIGHT);
        this.setSpeed(MOUSE_SPEED);
        this.setSatiety(MOUSE_SATIETY);
        this.setMaxValueOfEntity(MOUSE_MAX_VALUE);
    }
}
