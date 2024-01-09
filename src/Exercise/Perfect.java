package Exercise;

public class Perfect {
    public static void main(String[] args) {
        System.out.print("The perfect numbers from 1 through 1000: ");
        for (int x = 1; x <= 1000; x++) {
            check(x);
        }
    }

    private static void check(int value) {
        int sum = 0;
        for(int i = 1; i < value; i++)
        {
            if ((value % i) == 0){
                sum+=i;
            }
        }
        if(sum == value)
        {
            System.out.print(value + "\t");
        }
    }
}
