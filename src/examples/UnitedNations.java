package examples;

import java.util.List;

public class UnitedNations {

    public static void main(String[] args) {

        Ireland eire = new Ireland();
        Brazil brazil = new Brazil();


        List<Country> countries = List.of(eire, brazil);
        for (Country country : countries) {
            country.dance();
        }
    }


}
