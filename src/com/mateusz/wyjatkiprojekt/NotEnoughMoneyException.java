package com.mateusz.wyjatkiprojekt;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(int cena) {
        super("Nie wystarczająca kwota na zakup gry. Potrzebna kwota to: " + cena);
    }
}
