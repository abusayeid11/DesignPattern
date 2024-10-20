package Flyweight;

public class Character implements CharacterFlyweight{

    private char symbol;

    public Character(char symbol){
        this.symbol = symbol;
    }

    @Override
    public void display(int size, int x, int y) {
       System.out.println("Display character " + symbol + " " + size + " " + x + " " + y);
    }

    
    
}
