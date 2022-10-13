package lotr;

import java.util.Random;

public class RandomStatCharacter extends Character {

    public RandomStatCharacter(int StatOrigin, int StatBound) {
        super(RandomStatCharacter.getRandom(StatOrigin, StatBound + 1),
                RandomStatCharacter.getRandom(StatOrigin, StatBound + 1));
    }

    protected static int getRandom(int origin, int bound) {
        Random random = new Random();
        return random.nextInt(origin, bound);
    }
}
