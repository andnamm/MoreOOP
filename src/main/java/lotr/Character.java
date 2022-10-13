package lotr;

import KickTypes.Kick;
public class Character {
    protected int hp, power;
//    protected Kick kickType;

    public Character(int hp, int power) {
        this.setHp(hp);
        this.setPower(power);
    }

    public void kick(Character c) {
//        this.kickType(Character c);
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{"
                + "hp=" + this.getHp()
                + ", power=" + this.getPower()
                + "}";
    }

    protected boolean isAlive() {
        return this.getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public int getHp() {
        return this.hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    protected void decrease(String statToDecrease, int numToDecrease) {
        if (statToDecrease == "hp") {
            this.setHp(this.getHp() - numToDecrease);
        } else if (statToDecrease == "power") {
            this.setPower(this.getPower() - numToDecrease);
        }
    }
}
