package Memento;

public class GameSave {
    private Player.Memento memento;

    public void saveGame(Player.Memento memento){
        this.memento = memento;
        System.out.println(memento.getScore());
    }

    public Player.Memento loadGame(){
        System.out.println("Game loaded");
        return memento;
    }
}
