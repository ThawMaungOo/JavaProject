package OOPConcept.Inheritance.Overriding;

class Animal1{
    public void move(){
        System.out.println("Animal can move in any way.");
    }
}

class Dog1 extends Animal1{
    @Override
    public void move(){
        System.out.println("Do can run and walk.");
    }
}
public class TestDog {
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1();
        Animal1 animal11 = new Dog1();  //IS-A relationship
        animal1.move();     //call parent version move method
        animal11.move();    // child version move method
    }
}
