package lotr;

import java.util.Random;

public class Knight extends RandomStatCharacter {

    public Knight() {
        super(2, 12);
    }

    @Override
    public void kick(Character c) {
        c.decrease("hp", RandomStatCharacter.getRandom(0, this.getPower() + 1));
    }
}
