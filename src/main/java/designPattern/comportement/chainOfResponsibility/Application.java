package designPattern.comportement.chainOfResponsibility;

public class Application {
    public static void main(String[] args) {
        Handler hA = new ConcreteHandlerA();
        Handler hB = new ConcreteHandlerB();
        hA.setNext(hB);
        hA.handleRequest("A");
        hA.handleRequest("B");
        hA.handleRequest("C");
    }
}
