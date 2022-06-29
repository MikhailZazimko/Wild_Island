package ru.javarush.zazimko.wildisland;

import ru.javarush.zazimko.wildisland.classes.Game;
import ru.javarush.zazimko.wildisland.classes.util.Factory;
import ru.javarush.zazimko.wildisland.gameField.Field;
import ru.javarush.zazimko.wildisland.services.GameWorker;
import ru.javarush.zazimko.wildisland.view.ConsoleView;
import ru.javarush.zazimko.wildisland.view.View;

public class Runner {

    public static void main(String[] args) {
        Factory factory=new Factory();
        Field field=new Field();
        View view = new ConsoleView(field);
        Game game = new Game(factory,view,field);
        GameWorker gameWorker = new GameWorker(game);
        gameWorker.start();
    }
}
