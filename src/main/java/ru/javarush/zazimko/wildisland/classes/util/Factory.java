package ru.javarush.zazimko.wildisland.classes.util;

import ru.javarush.zazimko.wildisland.classes.animals.Animal;
import ru.javarush.zazimko.wildisland.classes.plants.Plant;
import ru.javarush.zazimko.wildisland.exceptions.IslandConfigException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static ru.javarush.zazimko.wildisland.modificators.Config.INITIAL_VALUE;
import static ru.javarush.zazimko.wildisland.modificators.Config.TYPES;

public class Factory {
    private static Class<?>[] types;

    private Factory() {
        this.types = TYPES;
    }

    public Animal[] createAnimals(Class<?>[] types) {
        Animal[] animals = new Animal[types.length*INITIAL_VALUE];
        for (Class<?> type : types) {
            try {
                Constructor<?> constructor = type.getConstructor();
                for (int i = 0; i < INITIAL_VALUE; i++) {
                    Animal newAnimal = (Animal) constructor.newInstance();
                    for (int j = 0; j < animals.length; j++) {
                        animals[j]=newAnimal;
                    }
                }
            } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                     IllegalAccessException | RuntimeException e) {
                throw new IslandConfigException("NO found constructor!!!");
            }
        }
        return animals;
    }

}
