package com.mateusz.wyjatkiprojekt;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GameMachineController {
    private GameMachine machine;

    public GameMachineController(GameMachine machine) {
        this.machine = machine;
    }
    public void uruchomMenu(){
        while (machine.czySaGry()){
            kupJednaGre();

        }
        System.out.println("Skończyły się gry. Dzięki za zakupy!");
    }

    public void kupJednaGre() {
        drukujMenu();
        String tytul = wybierzGre();
        try {
            Game game = znajdzGre(tytul);
            zaplac(game);
        } catch (GameNotFoundException | NotEnoughMoneyException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e){
            System.err.println("Należy podać kwotę liczbowo");
        }
    }

    public void drukujMenu() {
        List<Game> gry = machine.getGry();
        for (Game game : gry) {
            System.out.println(game);
        }
    }

    public String wybierzGre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Którą grę chcesz kupić?");
        String nazwaWybranejGry = scanner.nextLine();
        return nazwaWybranejGry;
    }

    public Game znajdzGre(String tytul) {
        Game gra = machine.znajdzGre(tytul);
        System.out.println("Gra znaleziona - " + gra);
        return gra;
    }

    public void zaplac(Game game) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Wybrana gra kosztuje - " + game.getCena() + "Ile płacisz?");
        int kwotaWybrana = skan.nextInt();
        int reszta = machine.kupGre(kwotaWybrana, game);
        System.out.println("Gra kupiona. Twoja reszta to " + reszta);

    }
}
