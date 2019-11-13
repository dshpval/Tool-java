package models;

public class SmallInfantryShovel extends Tool{

    private int handleLength;

    public SmallInfantryShovel(double wegiht, double price, String countryOfOrigin, String manufacturer,
                               String material, int yearsOfWarranty, Purpose purpose, int handleLength) {
        super(wegiht, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.handleLength = handleLength;
    }

    public SmallInfantryShovel() {
    }

    public int getHandleLength() {
        return handleLength;
    }

    public void setHandleLength(int handleLength) {
        this.handleLength = handleLength;
    }
}
