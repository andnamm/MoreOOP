package lab4;

import lotr.Character;
import lotr.CharacterFactory;
import lotr.GameManager;
import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        GameManager.fight(c1, c2);
    }
}