package designPattern.creation.prototype;

public class Application {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("data");
        ConcretePrototype copy = (ConcretePrototype) original.clone();
        original.show();
        copy.show();
    }
}
