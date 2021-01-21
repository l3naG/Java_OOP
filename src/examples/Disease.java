package examples;

import java.util.ArrayList;
import java.util.List;

/**
 * This is not a superclass
 */

public class Disease {

    private String name;
    private boolean curable;

    /**
     * This is the constructor
     * @param name specifying name of the disease
     * @param isCurable specifies disease is curable
     */

    public Disease(String name, boolean isCurable) {
        this.name = name;
        this.curable = isCurable;
    }

    public String getName() {
        return name;
    }

    public boolean isCurable() {
        return curable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurable(boolean curable) {
        this.curable = curable;
    }



    private static class DiseaseSorter {
        public static void main(String[] args) {

            Disease polio = new Disease("Polio", false);
            Disease flu = new Disease("Flue", true);
            Disease malaria = new Disease("Malaria", true);
            Disease cancer = new Disease("Cancer", false);


            List<Disease> diseases = new ArrayList<>();
            diseases.add(polio);
            diseases.add(flu);
            diseases.add(malaria);
            diseases.add(cancer);

            cancer.setCurable(true);

            System.out.println("Curable Diseases: ");
            for (Disease disease : diseases) {
                if (disease.curable) {
                    System.out.println(disease.getName());
                }
            }
        }
    }


}
