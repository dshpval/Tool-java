package models;

public class SapperShovel extends Tool {

    private int handleWidth;

    public SapperShovel(double wegiht, double price, String countryOfOrigin, String manufacturer, String material,
                        int yearsOfWarranty, Purpose purpose, int handleWidth) {
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
