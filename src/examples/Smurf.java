package examples;

public class Smurf {

    private String name;
    private static final Smurf PAPA = new Smurf("Papa");
    private static final Smurf SMURFETTE = new Smurf("Smurfette");
    static int numberOfSmurfsCreated;

    public Smurf(String name) {
        this.name = name;
        numberOfSmurfsCreated++;
    }

    public Smurf createSmurf(String name) {
        return new Smurf(name);
    }

    public static Smurf getPapa() {
        return PAPA;
    }

    public static Smurf getSmurfette() {
        return SMURFETTE;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Smurf createdSmurf(String name) {
        return new Smurf(name);
    }

    public static int getNumberOfSmurfsCreated() {
        return numberOfSmurfsCreated;
    }

    public void printName() {
        System.out.println("My name is " + name + " examples.Smurf.");
    }

    public void eat() {
        System.out.println(name + " examples.Smurf is eating Smurfberries.");
    }

}
