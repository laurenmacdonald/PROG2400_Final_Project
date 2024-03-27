public class Bidder {
    private int bidderId;
    private final String firstName;
    private final String lastName;
    private boolean isWinner;

    public Bidder(int bidderId, String firstName, String lastName, boolean isWinner) {
        this.bidderId = bidderId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isWinner = isWinner;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
