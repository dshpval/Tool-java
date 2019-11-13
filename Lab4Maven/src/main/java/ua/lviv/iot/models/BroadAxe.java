package ua.lviv.iot.models;

public class BroadAxe extends Tool {

    private Hand hand;
    private int cutOffDiametr;

    public BroadAxe(final double weight, final double price, final String countryOfOrigin, final String manufacturer,
                    final String material, final int yearsOfWarranty, final Purpose purpose, final Hand hand,
                    final int cutOffDiametr) {
        super(weight, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
        this.hand = hand;
        this.cutOffDiametr = cutOffDiametr;
    }

    public BroadAxe() {
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getCutOffDiametr() {
        return cutOffDiametr;
    }

    public void setCutOffDiametr(int cutOffDiametr) {
        this.cutOffDiametr = cutOffDiametr;
    }
}
