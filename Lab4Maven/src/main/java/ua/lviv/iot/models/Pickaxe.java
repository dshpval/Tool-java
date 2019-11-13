package ua.lviv.iot.models;

public class Pickaxe extends Tool {

    private int bladeWidth;

    public Pickaxe(final double wegiht, final double price, final String countryOfOrigin, final String manufacturer,
                   final String material, final int yearsOfWarranty, final Purpose purpose, final int bladeWidth) {
        super(wegiht, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.bladeWidth = bladeWidth;
    }

    public Pickaxe() {
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }
}
