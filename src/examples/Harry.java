package examples;

public class Harry {

    private boolean cloakOn;

    Harry() {
        System.out.println("making examples.Harry Potter...");
    }

    public void castSpell(String spell) {
        System.out.println("casting spell: " + spell);
    }

    public void makeInvisible(boolean invisible) {
        this.cloakOn = invisible;

        if (cloakOn)
            System.out.println("examples.Harry is invisible");
        else
            System.out.println("examples.Harry is visible");
    }

    public void spyOnSnape() {
        System.out.println("examples.Harry sees Professor Snape doing nefarious things.");
    }

    public static void main(String[] args) {


        Harry harry = new Harry();
        harry.makeInvisible(true);
        harry.spyOnSnape();
        harry.makeInvisible(false);
        harry.castSpell("stupefy");


    }
}
