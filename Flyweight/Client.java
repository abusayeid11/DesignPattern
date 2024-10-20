package Flyweight;

public class Client {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // Create characters 'A' and 'B'
        CharacterFlyweight charA = factory.getCharacter('A');
        CharacterFlyweight charB = factory.getCharacter('B');

        // Reuse the 'A' character for a different location and size
        CharacterFlyweight charA2 = factory.getCharacter('A');

        // Display characters with extrinsic state
        charA.display(12, 10, 20);   // Size: 12, Position: (10, 20)
        charB.display(14, 30, 40);   // Size: 14, Position: (30, 40)
        charA2.display(16, 50, 60);  // Same 'A' reused, Size: 16, Position: (50, 60)
    }
}
