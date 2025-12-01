package designPattern.structure.decorator;

public class Application {
    public static void main(String[] args) {
        Component base = new ConcreteComponent();
        Component decorated = new Decorator(base);
        decorated.operation();
    }
}
