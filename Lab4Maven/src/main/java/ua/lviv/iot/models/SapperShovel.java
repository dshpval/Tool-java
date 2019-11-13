package ua.lviv.iot.models;

public class SapperShovel extends Tool {

    private int handleWidth;

    public SapperShovel(final double wegiht, final double price, final String countryOfOrigin,
                        final String manufacturer, final String material,
                        final int yearsOfWarranty, final Purpose purpose, final int handleWidth) {
        super(wegiht, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);

        this.handleWidth = handleWidth;
    }

    public SapperShovel() {

    }

    public int getHandleWidth() {
        return handleWidth;
    }

    public void setHandleWidth(int handleWidth) {
        this.handleWidth = handleWidth;
    }
}
