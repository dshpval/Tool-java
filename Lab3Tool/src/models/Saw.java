package models;

public class Saw extends  Tool {

    private DriveType driveType;
    private int bladeLength;

    public Saw(double wegiht, double price, String countryOfOrigin, String manufacturer, String material,
               int yearsOfWarranty, Purpose purpose, DriveType driveType, int bladeLength) {
        super(wegiht, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.driveType = driveType;
        this.bladeLength = bladeLength;
    }

    public Saw() {
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }
}
