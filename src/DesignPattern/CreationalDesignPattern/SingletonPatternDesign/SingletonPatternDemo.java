package DesignPattern.CreationalDesignPattern.SingletonPatternDesign;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();
        instance.showMessage();
    }
}
