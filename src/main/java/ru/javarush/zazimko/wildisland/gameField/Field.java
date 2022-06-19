package ru.javarush.zazimko.wildisland.gameField;

import ru.javarush.zazimko.wildisland.modificators.Config;

import javax.swing.*;

public class Field implements Runnable {
    Cell[][] cells;
    JFrame frame;

    @Override
    public void run() {
        initFrame();
        initCells();
    }

    private void initCells() {
        cells = new Cell[Config.WIDTH][Config.HEIGHT];
        for (int i = 0; i < Config.WIDTH; i++) {
            for (int j = 0; j < Config.HEIGHT; j++) {
                cells[i][j]=new Cell(i,j);
                frame.add(cells[i][j]);
            }
        }
        for (int i = 0; i < Config.WIDTH; i++) {
            for (int j = 0; j < Config.HEIGHT; j++) {
                for (int x = -1; x < +1; x++) {
                    for (int y = -1; y <+1 ; y++) {
                        if(!(x==0)&&(y==0)){
                            cells[i][j].addNeighbors(cells[(i+x+Config.WIDTH)%Config.WIDTH][(j+y+Config.HEIGHT)%Config.HEIGHT]);
                        }
                    }

                    }
                }
            }
    }

    private void initFrame() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(Config.SIZE * Config.WIDTH, Config.SIZE * Config.HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Wild island");

    }
}
