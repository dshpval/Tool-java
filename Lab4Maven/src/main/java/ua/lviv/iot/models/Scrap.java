package ua.lviv.iot.models;

public class Scrap extends Tool {

    private int lenght;

    public Scrap(final double wegiht, final double price, final String countryOfOrigin,
                 final String manufacturer, final String material,
                 final int yearsOfWarranty, final Purpose purpose, final int lenght) {
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
