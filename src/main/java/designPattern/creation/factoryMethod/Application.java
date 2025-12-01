package designPattern.creation.factoryMethod;

public class Application {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.someOperation();
    }
}
