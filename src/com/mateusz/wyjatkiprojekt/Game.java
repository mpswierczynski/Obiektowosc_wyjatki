package com.mateusz.wyjatkiprojekt;

public class Game {
    private String tytul;
    private int cena;

    public Game(String tytul, int cena) {
        this.tytul = tytul;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Tytuł: " + tytul + " - Cena " + cena;

    }

    public String getTytul() {
        return tytul;
    }

    public int getCena() {
        return cena;
    }
}
