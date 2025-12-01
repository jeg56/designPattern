package designPattern.comportement.templateMethod;

public class Application {
    public static void main(String[] args) {
        AbstractClass obj = new ConcreteClass();
        obj.templateMethod();
    }
}
