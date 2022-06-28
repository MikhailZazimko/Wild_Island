package ru.javarush.zazimko.wildisland.classes.animals;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
public abstract class Animal extends Organism {

    public Animal() {
        super();
    }
}
