package OOPConcept.Inheritance.Exercise;

public class Salary {
    public static void main(String[] args) {
        System.out.println("The weekly salary of an employee: $" + weeklySalary());
    }

    public static float weeklySalary(){
        int regular = 40 * 25;
        float overTime = 13 * 25 * 1.5f;
        return regular+overTime;
    }
}
