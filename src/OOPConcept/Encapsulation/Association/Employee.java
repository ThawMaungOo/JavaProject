package OOPConcept.Encapsulation.Association;

public class Employee {
    private int id;
    private String name;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address ad1 = new Address("North Dagon", "Yangon", "Myanmar");
        Address ad2 = new Address("Hlaing", "Yangon", "Myanmar");
        Employee em1 = new Employee(1, "Aung Aung", ad1);
        Employee em2 = new Employee(2, "Myo Myo", ad2);
        System.out.println("employee 1 \n" + em1);
        System.out.println("employee 2 \n" + em2);
        em1 = null;
        System.out.println(em1);
    }
}
