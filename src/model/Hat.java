package model;

public class Hat extends ClothingItem {

    public Hat(String size, double price) {
        super("Hat", size, price);
    }


    @Override
    public double getPrice() {
        return 12.00;
    }
}
