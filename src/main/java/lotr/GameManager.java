package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        int rounds = 1;
        Character[] chr = {c1, c2};
        int first_to_kick = (int) Math.round(Math.random());
        c1 = chr[first_to_kick];
        c2 = chr[1 - first_to_kick];

        System.out.println("======Let The Battle Begin!======");
        System.out.println("Rival NO. 1 is: " + c1);
        System.out.println("Rival NO. 2 is: " + c2);

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("===Round " + rounds + "===");
            if (rounds == 1) System.out.println(c1 + " is going to kick first!");
            System.out.println();

            System.out.println(c1 + " kicks " + c2);
            c1.kick(c2);

            if (c2.isAlive()) {
                System.out.println(c2 + " hits back " + c1);
                c2.kick(c1);
            }
            if (c1.isAlive() && c2.isAlive()) {
                System.out.println();
                System.out.println("Currently NO. 1: " + c1);
                System.out.println("Currently NO. 2: " + c2);
            }

            if (c1 instanceof Hobbit && c2 instanceof Hobbit && rounds == 3) {
                System.out.println("AHHAHAHA. They will cry each other to death");
                System.out.println("=====And we have TWO LOSERS=====");
                break;
            }
            rounds++;
        }
        if (!(c1 instanceof Hobbit && c2 instanceof Hobbit)) {
            Character winner;
            int winnerNO;
            if (c1.isAlive()) { winner = c1; winnerNO = 1; }
            else { winner = c2; winnerNO = 2; }

            System.out.println();
            System.out.println("That was a massive kick from rival NO." + winnerNO + ": " + winner);
            System.out.println("=====And HE wins this battle!!!=====");
        }
    }
}
