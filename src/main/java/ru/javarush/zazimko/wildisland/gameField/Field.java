package ru.javarush.zazimko.wildisland.gameField;

import ru.javarush.zazimko.wildisland.modificators.Config;

public class Field {
    Cell[][] cells;

    public Field() {
        this.cells = new Cell[Config.WIDTH][Config.HEIGHT];
        initCells();
    }

    public void initCells() {
            for (int i = 0; i < Config.WIDTH; i++) {
            for (int j = 0; j < Config.HEIGHT; j++) {
                cells[i][j]=new Cell();
            }
        }

    }
    public Cell[][] getCells(){
        return cells;

    }

}
