package ua.lviv.iot.models;


public class SmallInfantryShovel extends Tool{

    private int handleLength;

    public SmallInfantryShovel(final double wegiht, final double price, final String countryOfOrigin,
                               final String manufacturer, final String material,
                               final int yearsOfWarranty, final Purpose purpose, final int handleLength) {
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
