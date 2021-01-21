package examples;

public class Duck {

    private String name;
    private int lifeExpectancy;
    private String favouriteFood;

    public Duck(String name, int lifeExpectancy, String favouriteFood) {
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
        this.favouriteFood = favouriteFood;
    }

    public void waddle() {
        lifeExpectancy++;
        System.out.println(this.name + "is waddling");
    }

    public void quack() {
        System.out.println(this.name + "is quacking");
    }

    @Override
    public String toString() {
        return String.format("My name is %s and I like to eat %s and my life expectancy is %d", name, favouriteFood, lifeExpectancy);
    }
}
