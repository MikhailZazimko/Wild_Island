package ru.javarush.zazimko.wildisland.gameField;

import ru.javarush.zazimko.wildisland.modificators.Config;
import ru.javarush.zazimko.wildisland.modificators.Status;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell extends JPanel {
    CopyOnWriteArrayList<?> organisms;
    ArrayList<Cell> neighbors;
    Status status;

    public Cell(int x, int y) {
        super();
        organisms=new CopyOnWriteArrayList<>();
        neighbors=new ArrayList<>();
        status = Status.NONE;
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);


    }
    public void addNeighbors(Cell cell){
        neighbors.add(cell);
    }
}
