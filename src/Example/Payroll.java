package Example;

public class Payroll {
    private float numofhours;
    private float hourlyrate;
    public Payroll(float nhour, float hrate)
    {
        numofhours = nhour;
        hourlyrate = hrate;
    }
    public float calculateNetPay()
    {
        float grossPay = numofhours * hourlyrate;
        float tax = grossPay * 0.15f;
        float netPay = grossPay - tax;
        return netPay;
    }
    public void display()
    {
        float netPay = calculateNetPay();
        System.out.println("Your net pay is " + netPay);
        System.out.printf("Your net pay is %6.2f",netPay);
    }

    public static void main(String[] args) {
        Payroll payroll = new Payroll(8, 13);
        payroll.display();
    }
}
