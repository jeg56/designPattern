package designPattern.creation.abstractFactory;

public class Application {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA a1 = factory1.createProductA();
        ProductB b1 = factory1.createProductB();
        a1.showA();
        b1.showB();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA a2 = factory2.createProductA();
        ProductB b2 = factory2.createProductB();
        a2.showA();
        b2.showB();
    }
}
