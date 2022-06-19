package ru.javarush.zazimko.wildisland.classes.animals.herbivores;

import ru.javarush.zazimko.wildisland.classes.animals.Animal;
import ru.javarush.zazimko.wildisland.classes.plants.Plant;

public abstract class Herbivores extends Animal {

    public abstract void toDie() ;


    public abstract void toEat(Plant plant);


    public abstract void toMove() ;

    public abstract void toMultiply(Herbivores herbivore) ;

}
