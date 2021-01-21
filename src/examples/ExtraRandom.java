package examples;

import java.util.Random;

public class ExtraRandom extends Random {

    public static String nextLetter() {
        int valA = 'a';
        int randomLetter = new Random().nextInt(26) + valA;
        return Character.toString((char) randomLetter);
    }
}
