package models;

public class Pickaxe extends Tool {

    private int bladeWidth;

    public Pickaxe(double wegiht, double price, String countryOfOrigin, String manufacturer, String material, int yearsOfWarranty, Purpose purpose, int bladeWidth) {
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
