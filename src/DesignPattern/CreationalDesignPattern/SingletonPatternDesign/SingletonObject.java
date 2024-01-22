package DesignPattern.CreationalDesignPattern.SingletonPatternDesign;

public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    //made private not to visible from others
    private SingletonObject(){}

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
