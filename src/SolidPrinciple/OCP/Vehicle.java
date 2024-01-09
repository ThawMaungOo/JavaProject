package SolidPrinciple.OCP;

public class Vehicle
{
    String type;
    int maxSpeed;

    public Vehicle(String type, int maxSpeed)
    {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public float calculateAllowedSpeed()
    {
        return maxSpeed;
    }
}
