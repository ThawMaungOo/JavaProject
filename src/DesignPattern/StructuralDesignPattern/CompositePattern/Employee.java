package DesignPattern.StructuralDesignPattern.CompositePattern;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name, dept;
    private  int salary;
    private List<Employee> subordinate;

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinate = new ArrayList<>();
    }

    public void addSubordinate(Employee e){
        subordinate.add(e);
    }

    public void removeSubordinate(Employee e){
        subordinate.remove(e);
    }

    public List<Employee> getSubordinate(){
        return subordinate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
