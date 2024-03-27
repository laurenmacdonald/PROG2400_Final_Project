public class Item {
    private int itemID;
    private String itemName;
    private String itemDescription;
    private int minimumPrice;
    public Item(int itemID, String itemName, String itemDescription, int minimumPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.minimumPrice = minimumPrice;
    }

    public String getItemName() {
        return itemName;
    }
    public String getItemDescription() { return itemDescription; }
    public int getMinimumPrice() {
        return minimumPrice;
    }
    public void setMinimumPrice(int minimumPrice){
        this.minimumPrice = minimumPrice;
    }

}
