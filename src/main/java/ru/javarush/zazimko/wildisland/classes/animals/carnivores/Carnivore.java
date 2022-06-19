package ru.javarush.zazimko.wildisland.classes.animals.carnivores;

import ru.javarush.zazimko.wildisland.classes.animals.Animal;
import ru.javarush.zazimko.wildisland.classes.animals.herbivores.Herbivores;

public abstract class Carnivore extends Animal {


    public abstract void toDie() ;


    public abstract void toEat(Herbivores herbivore);


    public abstract void toMove() ;

    public abstract void toMultiply(Carnivore carnivore) ;
}
