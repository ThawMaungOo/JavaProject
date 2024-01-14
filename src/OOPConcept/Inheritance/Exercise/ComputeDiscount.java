package OOPConcept.Inheritance.Exercise;

public class ComputeDiscount extends Discount{
    float drate;
    public ComputeDiscount(String itnum, String itna, int qty, float pri, float drate){
        super(itnum,itna,qty,pri);
        this.drate = drate;
    }

    @Override
    public float computePrice(){
        float amt = super.computePrice();
        return amt - (amt*drate);
    }
}
