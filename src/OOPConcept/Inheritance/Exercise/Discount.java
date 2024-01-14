package OOPConcept.Inheritance.Exercise;

public class Discount {
    private String itemNumber;
    private String itemName;
    int quantity;
    float price;
    public Discount(String itnum, String itna, int qty, float pri){
        itemNumber = itnum;
        itemName = itna;
        quantity = qty;
        price = pri;
    }

    public float computePrice(){
        return quantity*price;
    }
}
