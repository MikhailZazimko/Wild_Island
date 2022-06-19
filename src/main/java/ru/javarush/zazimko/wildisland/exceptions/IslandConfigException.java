package ru.javarush.zazimko.wildisland.exceptions;

public class IslandConfigException extends RuntimeException{
    //Будет выбрасываться если при запуске приложения
    // на найден конфигурационный файл в ресурсах
    public IslandConfigException(String message) {
        super(message);
    }
}
