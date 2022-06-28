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
                cells[i][j]=new Cell(i,j);

            }
        }
        for (int i = 0; i < Config.WIDTH; i++) {
            for (int j = 0; j < Config.HEIGHT; j++) {
                for (int x = -1; x < 1; x++) {
                    for (int y = -1; y <1 ; y++) {
                        if(!(x==0)&&(y==0)){
                            cells[i][j].addNeighbors(cells[(i+x+Config.WIDTH)%Config.WIDTH][(j+y+Config.HEIGHT)%Config.HEIGHT]);
                        }
                    }

                    }
                }
            }
    }
    public Cell[][] getCells(){
        return cells;

    }
}
