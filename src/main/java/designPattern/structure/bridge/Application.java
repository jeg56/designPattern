package designPattern.structure.bridge;

public class Application {
    public static void main(String[] args) {
        Implementor implA = new ConcreteImplementorA();
        Implementor implB = new ConcreteImplementorB();
        Abstraction absA = new RefinedAbstraction(implA);
        Abstraction absB = new RefinedAbstraction(implB);
        absA.operation();
        absB.operation();
    }
}
