package com.mateusz.wyjatkiprojekt;

public class GameNotFoundException extends RuntimeException{
    public GameNotFoundException(String tytul) {
        super("Nie znaleziono gry o wpisanym tytule : " + tytul);
    }
}
