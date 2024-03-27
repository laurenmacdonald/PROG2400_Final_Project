import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List of bidders for testing purposes
        List<Bidder> bidderList = getBidders();
        Item fancyVase = new Item(1, "Fancy Vase", "Put fancy flowers in it.", 500);
        Auction auction = new Auction(1, fancyVase);
        auction.runAuction(bidderList, 20, 15000);

    }

    /**
     * Creating Bidder objects for the auction.
     * @return list of bidders participating in auction
     */
    private static List<Bidder> getBidders() {
        List<Bidder> bidderList = new ArrayList<>();
        // Create new bidders
        Bidder bidder1 = new Bidder(1, "Jim", "Bean", false);
        Bidder bidder2 = new Bidder(2, "Jane", "Doe", false);
        Bidder bidder3 = new Bidder(3, "Dude", "Guy", false);
        Bidder bidder4 = new Bidder(4, "Someone", "LastName", false);
        bidderList.add(bidder1);
        bidderList.add(bidder2);
        bidderList.add(bidder3);
        bidderList.add(bidder4);
        return bidderList;
    }

}

