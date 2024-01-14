package OOPConcept.Inheritance.Exercise;

public class Discount {
    private String itemNumber;
    private String itemName;
    private int quantity;
    private float price;
    public Discount(String itnum, String itna, int qty, float pri){
        this.itemNumber = itnum;
        this.itemName = itna;
        this.quantity = qty;
        this.price = pri;
    }

    public float computePrice(){
        return quantity*price;
    }
}
