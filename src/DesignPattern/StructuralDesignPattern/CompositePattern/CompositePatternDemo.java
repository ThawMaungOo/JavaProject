package DesignPattern.StructuralDesignPattern.CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Mr. Kevin", "CEO",45000000);
        Employee headMarket = new Employee("Ms. Mary", "Market",35000000);
        Employee headSales = new Employee("Ms. Catherine", "Sales",35000000);
        Employee saleExecutive1 = new Employee("Mr. Robert", "Sales Executive",45000000);
        Employee saleExecutive2 = new Employee("Mr. Andrew", "Sales Executive",45000000);
        Employee clerk1 = new Employee("Mr. Keith", "Marketing clerk",45000000);
        Employee clerk2 = new Employee("Mr. Miley", "Marketing clerk",45000000);

        ceo.addSubordinate(headMarket);
        ceo.addSubordinate(headSales);
        headMarket.addSubordinate(clerk1);
        headMarket.addSubordinate(clerk2);
        headSales.addSubordinate(saleExecutive1);
        headSales.addSubordinate(saleExecutive2);

        for (Employee head: ceo.getSubordinate()){
            System.out.println(head);
            for (Employee emp: head.getSubordinate()){
                System.out.println(emp);
            }
        }

    }
}
