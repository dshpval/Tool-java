package models;

public class Scrap extends Tool {

    private int lenght;

    public Scrap(double wegiht, double price, String countryOfOrigin, String manufacturer, String material,
                 int yearsOfWarranty, Purpose purpose, int lenght) {
        super(wegiht, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.lenght = lenght;
    }

    public Scrap() {
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
