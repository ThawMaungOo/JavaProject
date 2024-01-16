package OOPConcept.Polymorphism.Interface;

public class Mammal implements Animal{

    @Override
    public void eat() {
        System.out.println("Mammals can eat");
    }

    @Override
    public void travel() {
        System.out.println("Mammals can travel");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.eat();
        m.travel();
    }
}
