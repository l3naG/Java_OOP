package examples;

public class Pond {

    public static void main(String[] args) {
        Duck mobyDuck = new Duck("Moby", 90 / 3, "celery");
        Duck wolfgangDuck = new Duck("Wolfgang", 60 / 3, "cheesburger");

        mobyDuck.quack();
        wolfgangDuck.waddle();
        System.out.println(mobyDuck);
        System.out.println(wolfgangDuck);

    }
}
