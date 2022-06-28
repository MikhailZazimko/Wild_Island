package ru.javarush.zazimko.wildisland.classes.plants;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.zazimko.wildisland.classes.animals.Organism;
import ru.javarush.zazimko.wildisland.classes.util.Randoms;

import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import static ru.javarush.zazimko.wildisland.modificators.Config.*;

@Getter
@Setter
public class Plant extends Organism {
    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());
    private final long id = idCounter.incrementAndGet();
    private double weight;
    private int maxValue;
    private String name;

    public Plant(String name, double weight, double maxWeight, double satiety, int maxValueOfEntity, int speed, String icon, ConcurrentHashMap<Type, Integer> initializedRation) {
        super(name, weight, maxWeight, satiety, maxValueOfEntity, speed, icon, initializedRation);
    }

    public Plant() {
        this.setName("Buffalo " + this.getId());
        this.setIcon(PLANT_ICON);
        this.setWeight(PLANT_WEIGHT);
        this.setMaxValue(PLANT_MAX_VALUE);
    }


    public Plant toMultiply() {

return new Plant();
    }
}
