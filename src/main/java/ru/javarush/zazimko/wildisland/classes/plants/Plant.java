package ru.javarush.zazimko.wildisland.classes.plants;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicLong;

import static ru.javarush.zazimko.wildisland.modificators.Config.PLANT_MAX_VALUE;
import static ru.javarush.zazimko.wildisland.modificators.Config.PLANT_WEIGHT;

@Getter
@Setter
public class Plant {
    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());
    private final long id = idCounter.incrementAndGet();
    private int weight;
    private int maxValue;
    private String name;

    public Plant() {
        this.name="Plant "+this.getId();
        this.weight = PLANT_WEIGHT;
        this.maxValue = PLANT_MAX_VALUE;
    }
}
