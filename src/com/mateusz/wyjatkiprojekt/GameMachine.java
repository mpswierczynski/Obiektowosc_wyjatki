package com.mateusz.wyjatkiprojekt;

import java.util.ArrayList;
import java.util.List;

public class GameMachine {

    private List<Game> gry = new ArrayList<>();

    public void dodajGre(Game game) {
        gry.add(game);
    }

    public List<Game> getGry() {
        return gry;
    }

    public Game znajdzGre(String tytul) {
        for (Game game : gry) {
            if (game.getTytul().equalsIgnoreCase(tytul)) {
                return game;
            }
        }
        throw new GameNotFoundException(tytul);
    }

    public int kupGre(int kwotaWybrana, Game game) {
        if (kwotaWybrana < game.getCena()) {
            throw new NotEnoughMoneyException(game.getCena());
        }
        int reszta = game.getCena() - kwotaWybrana;
        gry.remove(game);
        return reszta;
    }

    public boolean czySaGry() {
        return !gry.isEmpty();
    }
}
