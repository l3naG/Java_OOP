package examples;

public class Athlete {
    private String name;
    private int speed;
    private static String marathonLocation;
    private int bidNumber;
    private static int runnersInRace;

    public void setMarathonLocation(String marathonLocation) {
        this.marathonLocation = marathonLocation;
    }

    public static int getRunnersInRace() {
        return runnersInRace;
    }


    public Athlete(String name, int speed) {
        this.name = name;
        this.speed = speed;
        runnersInRace++;
        this.bidNumber = runnersInRace;
    }

    @Override
    public String toString() {
        return String.format("examples.Athlete %s is running %d miles per hour at %s at %s", name, speed, marathonLocation, bidNumber);
    }
}
