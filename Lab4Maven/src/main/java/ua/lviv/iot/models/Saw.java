package ua.lviv.iot.models;

public class Saw extends  Tool {

    private DriveType driveType;
    private int bladeLength;

    public Saw(final double wegiht, final double price, final String countryOfOrigin, final String manufacturer,
               final String material,
               final int yearsOfWarranty, final Purpose purpose, final DriveType driveType, final int bladeLength) {
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
