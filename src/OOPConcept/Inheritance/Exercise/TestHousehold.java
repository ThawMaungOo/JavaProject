package OOPConcept.Inheritance.Exercise;

public class TestHousehold {

    public static void main(String[] args) {
        Household household = new Household();
        System.out.println("Testing no argument constructor and getter methods");
        System.out.printf("%-20s %-5d \n%-20s %-5.0f\n\n","no of occupants", household.getOccupants(), "income", household.getIncomes());

        household.setIncomes(1000000);
        System.out.println("After setting income");
        System.out.printf("%-20s %-5d \n%-20s %-5.0f\n\n","no of occupants", household.getOccupants(), "income", household.getIncomes());


        Household household1 = new Household(3);
        household1.setIncomes(2000000f);
        System.out.println("Testing one argument constructor and getter method");
        System.out.printf("%-20s %-5d \n%-20s %-5.0f\n\n","no of occupants", household.getOccupants(), "income", household.getIncomes());


        Household household2 = new Household(5,3000000);
//        household1.setIncomes(20000000f);
        System.out.println("Testing two argument constructor and getter method");
        System.out.printf("%-20s %-5d \n%-20s %-5.0f","no of occupants", household.getOccupants(), "income", household.getIncomes());



    }
}
