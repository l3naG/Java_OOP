package examples;

public class DoctorVillage {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.doMedicine();
        Doctor surgeon = new Surgeon();
        surgeon.doMedicine();
        Doctor generalPractitioner = new GeneralPractitioner();
        generalPractitioner.doMedicine();
    }
}
