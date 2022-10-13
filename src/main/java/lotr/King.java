package lotr;

import java.util.Random;

public class King extends RandomStatCharacter {

    public King() {
        super(5,15);
    }
    @Override
    public void kick(Character c) {
        c.decrease("hp", RandomStatCharacter.getRandom(0, this.getPower() + 1));
    }
}
