public class Bid {
    private final Bidder bidder;
    private final int bidAmount;

    public Bid(Bidder bidder, int bidAmount, long l) {
        this.bidder = bidder;
        this.bidAmount = bidAmount;
    }

    public Bidder getBidder() {
        return bidder;
    }


    public int getBidAmount() {
        return bidAmount;
    }
}
