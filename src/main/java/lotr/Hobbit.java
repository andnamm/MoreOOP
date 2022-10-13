package lotr;

import KickTypes.CryKick;
public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit is crying.");
    }

}
