package SolidPrinciple.OCP;

public class Bus extends Vehicle
{

    public Bus(String type, int maxSpeed)
    {
        super(type, maxSpeed);
    }

    @Override
    public float calculateAllowedSpeed() {
        return maxSpeed * 0.6f;
    }

    public static void main(String[] args) {
        Car car = new Car("Car", 120);
        float speed = car.calculateAllowedSpeed();
        System.out.println("Allower speed for car " + speed);

    }
}

