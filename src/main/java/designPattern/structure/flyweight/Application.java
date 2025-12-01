package designPattern.structure.flyweight;

public class Application {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fw1 = factory.getFlyweight("A");
        Flyweight fw2 = factory.getFlyweight("A");
        Flyweight fw3 = factory.getFlyweight("B");
        fw1.operation("state1");
        fw2.operation("state2");
        fw3.operation("state3");
    }
}
