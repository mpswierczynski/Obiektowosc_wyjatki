package com.mateusz.wyjatkiprojekt;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("Diablo", 140);
        Game game2 = new Game("GTA", 120);
        Game game3 = new Game("Witcher", 200);

        GameMachine gameMachine = new GameMachine();

        gameMachine.dodajGre(game);
        gameMachine.dodajGre(game2);
        gameMachine.dodajGre(game3);

        GameMachineController controller = new GameMachineController(gameMachine);
        controller.uruchomMenu();

    }

}
