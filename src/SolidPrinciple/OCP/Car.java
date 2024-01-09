package SolidPrinciple.OCP;

public class Car extends Vehicle{
    public Car(String type, int maxSpeed)
    {
        super(type, maxSpeed);
    }

    @Override
    public float calculateAllowedSpeed()
    {
        return maxSpeed * 0.8f;
    }
}
