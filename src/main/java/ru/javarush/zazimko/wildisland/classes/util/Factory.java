package ru.javarush.zazimko.wildisland.classes.util;

import ru.javarush.zazimko.wildisland.classes.animals.Organism;
import ru.javarush.zazimko.wildisland.exceptions.IslandConfigException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import static ru.javarush.zazimko.wildisland.modificators.Config.INITIAL_VALUE;
import static ru.javarush.zazimko.wildisland.modificators.Config.TYPES;

public class Factory {
    private final Class<?>[] types;
    private final int quantity;

    public Factory() {
        this.types = TYPES;
        this.quantity=INITIAL_VALUE;
    }

    public ConcurrentHashMap<Type, Set<Organism>> createAnimals() {
        ConcurrentHashMap<Type, Set<Organism>> organisms=new ConcurrentHashMap<>();
        for (Class<?> type : types) {
            try {
                Set<Organism> animals = new HashSet<>();
                Constructor<?> constructor = type.getConstructor();
                for (int i = 0; i < quantity; i++) {
                    Organism organism = (Organism) constructor.newInstance();
                        animals.add(organism);
                    }
                organisms.put(type,animals);

            } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                     IllegalAccessException | RuntimeException e) {
                throw new IslandConfigException("NO found constructor!!!");
            }
        }
        return organisms;
    }

}
