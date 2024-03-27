import java.util.*;

public class Auction {
    private int auctionID;
    private final Item item;
    private final PriorityQueue<Bid> bidPriorityQueue;
    private int highestBid;

    public Auction(int auctionID, Item item) {
        this.auctionID = auctionID;
        this.item = item;
        this.bidPriorityQueue = new PriorityQueue<>(Comparator.comparingInt(Bid::getBidAmount).reversed());
    }

    /**
     * Run the associated auction methods for the time specified.
     * @param bidderList list of Bidders participating in auction
     * @param time millisecond value that the auction will run
     * @param maximumBidAmount setting a maximum bid for the random number generator to stop at
     */
    public void runAuction(List<Bidder> bidderList, int time, int maximumBidAmount){
        displayStartingInfo();
        // Random for testing purposes to be used for setting bids.
        Random random = new Random();
        // count of how many bids are placed
        int count = 0;
        long startTime = System.currentTimeMillis();
        // over the course of time specified, iterate through list of bidders and supply a random int for a bid to be recorded in the priority queue
        while (System.currentTimeMillis() - startTime <= time) {
            for (Bidder bidder : bidderList) {
                count++;
                int bidAmount = random.nextInt(maximumBidAmount);
                Bid bid = new Bid(bidder, bidAmount, System.currentTimeMillis());
                this.bidPriorityQueue.add(bid);
                if (bid.getBidAmount() > this.item.getMinimumPrice()) {
                    this.item.setMinimumPrice(bid.getBidAmount());
                    this.highestBid = bid.getBidAmount();
                    System.out.println("New highest bid of $" + this.highestBid + ". Minimum required bid updated.");
                } else if(bid.getBidAmount() == this.highestBid) {
                    System.out.println(bidder.getFullName() + "'s bid invalid, matches current highest bid.");
                } else {
                    System.out.println(bidder.getFullName() + "'s bid of $" + bid.getBidAmount() +
                            " does not meet the minimum threshold of $" + this.item.getMinimumPrice());
                }
            }
        }
        displayOutcome(count);
    }

    /**
     * Find the top three highest bids from the priority queue.
     * @return the top three bids
     */
    public List<Bid> findTopThree() {
        // Retrieve the three highest bids
        Bid topBid = this.bidPriorityQueue.poll();
        Bid secondTopBid = this.bidPriorityQueue.poll();
        Bid thirdTopBid = this.bidPriorityQueue.poll();
        List<Bid> topBids = new ArrayList<>();
        topBids.add(topBid);
        topBids.add(secondTopBid);
        topBids.add(thirdTopBid);
        return topBids;
    }

    /**
     * Will print out the number of bids placed and top three highest bids and the person who bid them.
     *
     * @param count number of bids placed.
     */
    public void displayOutcome(int count){
        List<Bid> highestBids = findTopThree();
        Bidder winnerBidder = highestBids.get(0).getBidder();
        int highestBid = highestBids.get(0).getBidAmount();
        winnerBidder.setWinner(true);

        System.out.println("RESULTS");
        System.out.println("==================================");
        System.out.println(count + " bids placed for the "+ this.item.getItemName()+ ".");
        System.out.println("The highest bid is: $" + highestBid + " by " + winnerBidder.getFullName());
        System.out.println("The runner up was: $" + highestBids.get(1).getBidAmount() + " by " + highestBids.get(1).getBidder().getFullName());
        System.out.println("The third place was: $" + highestBids.get(2).getBidAmount() + " by " + highestBids.get(2).getBidder().getFullName());
    }

    /**
     * Display the starting information for the auction (item name and min price)
     */
    public void displayStartingInfo(){
        System.out.println("AUCTION STARTING");
        System.out.println("==================================");
        System.out.println("Item for auction: " + this.item.getItemName());
        System.out.println("Item description: " + this.item.getItemDescription());
        System.out.println("Starting price at: $" + this.item.getMinimumPrice());
        System.out.println("==================================");
    }
}
