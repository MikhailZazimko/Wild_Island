package ru.javarush.zazimko.wildisland;

import ru.javarush.zazimko.wildisland.gameField.Field;

public class Runner {
    public static void main(String[] args) {
        Field field = new Field();
        javax.swing.SwingUtilities.invokeLater(field);
    }
}
