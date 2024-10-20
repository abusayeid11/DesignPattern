package Flyweight;

import java.util.HashMap;
import java.util.Map;



// Flyweight Factory
class CharacterFactory {
    private Map<Character, CharacterFlyweight> characters = new HashMap<>();  // Use Character, not char

    public CharacterFlyweight getCharacter(char symbol) {
        Character characterKey = new Character(symbol);  // Autoboxing char to Character
        CharacterFlyweight character = characters.get(characterKey);

        // If the character doesn't exist, create and add it to the pool
        if (character == null) {
            character = new Character(symbol);
            characters.put(characterKey, character);  // Use Character type for the key
        }

        return character;
    }
}

