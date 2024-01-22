package OOPConcept.Encapsulation.Association;

public class Car {
    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Peugeot 3008", new Engine("Petrol"));
        Car car2 = new Car("BMW X5 Diesel", new Engine("Diesel"));
        System.out.println(car1);
        System.out.println(car2);
    }
}
