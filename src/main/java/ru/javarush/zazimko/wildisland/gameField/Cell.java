package ru.javarush.zazimko.wildisland.gameField;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.zazimko.wildisland.classes.animals.Organism;
import ru.javarush.zazimko.wildisland.modificators.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

@Setter
@Getter
public class Cell {
    private final ConcurrentHashMap<Type, Set<Organism>> organisms;
    private final ArrayList<Cell> neighbors;
    private Status status;
    private final Lock lock = new ReentrantLock(true);

    public Cell(int x, int y) {
        organisms = new ConcurrentHashMap<>();
        neighbors = new ArrayList<>();
        status = Status.NONE;

    }

    public void addNeighbors(Cell cell) {
        neighbors.add(cell);
    }

    public void setOrganisms(ConcurrentHashMap<Type, Set<Organism>> animals) {
        if(animals.size()>0){
            status=Status.LIVING;
            this.organisms.putAll(animals);
        }

    }
    public String toString() {
        return getOrganisms().values().stream()
                .filter((list) -> list.size() > 0)
                .sorted((o1, o2) -> o2.size() - o1.size())
                .map(set -> set
                        .stream()
                        .findAny()
                        .map(Organism::getLetter)
                        .orElse("?"))
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
