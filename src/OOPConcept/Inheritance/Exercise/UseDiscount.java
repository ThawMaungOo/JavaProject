package OOPConcept.Inheritance.Exercise;

public class UseDiscount {
    public static void main(String[] args) {
        ComputeDiscount computeDiscount = new ComputeDiscount("A-11", "Egg", 3, 250,0.15f );
        float netAmount = computeDiscount.computePrice();
        System.out.println("netAmount = " + netAmount);
    }
}
