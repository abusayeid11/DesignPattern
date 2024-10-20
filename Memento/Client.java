package Memento;

import Memento.Player.Memento;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.setScore(200);

        GameSave gameSave = new GameSave();


       Memento memento = player.save();
       gameSave.saveGame(memento);

        player.setScore(500);

        Memento memento2 = player.save();
        gameSave.saveGame(memento2);

        player.setScore(1000);


        player.restore(memento);

        player.getScore();

      
    }
}
