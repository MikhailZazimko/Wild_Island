package ru.javarush.zazimko.wildisland.classes.animals;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
public abstract class Animal {
    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());
    private final long id = idCounter.incrementAndGet();
    private String name;
    private double weight;
    private double satiety;
    private int maxValueOfEntity;
    private int speed;
    private String icon;

}
