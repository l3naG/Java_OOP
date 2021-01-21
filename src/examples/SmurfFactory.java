package examples;

public class SmurfFactory {

    public static void main(String[] args) {

        Smurf.getSmurfette().printName();
        Smurf.getPapa().printName();
        Smurf.getSmurfette();
        Smurf.getSmurfette();
        Smurf.getSmurfette();
        Smurf.getSmurfette();
        Smurf.createdSmurf("Bluebell").printName();
        Smurf.createdSmurf("Handy").printName();
        System.out.println(Smurf.getNumberOfSmurfsCreated());


    }
}
