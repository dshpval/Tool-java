package models;

public class BroadAxe extends Tool {

    private Hand hand;
    private int cutOffDiametr;

    public BroadAxe(double wegiht, double price, String countryOfOrigin, String manufacturer,
                    String material, int yearsOfWarranty, Purpose purpose, Hand hand, int cutOffDiametr) {
        super(wegiht, price, countryOfOrigin, manufacturer, material, yearsOfWarranty, purpose);
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
