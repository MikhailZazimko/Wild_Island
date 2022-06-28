package ru.javarush.zazimko.wildisland.modificators;

import ru.javarush.zazimko.wildisland.classes.animals.carnivores.Fox;
import ru.javarush.zazimko.wildisland.classes.animals.carnivores.Snake;
import ru.javarush.zazimko.wildisland.classes.animals.herbivores.*;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

public class Ration implements Serializable {
    public static final ConcurrentHashMap<Type, Integer> BEAR_RATION = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Type, Integer> EAGLE_RATION=new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Type, Integer> FOX_RATION=new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Type, Integer> SNAKE_RATION=new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Type, Integer> WOLF_RATION=new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Type, Integer> DUCK_RATION=new ConcurrentHashMap<>();

}
