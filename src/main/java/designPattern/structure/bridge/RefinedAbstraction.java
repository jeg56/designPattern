package designPattern.structure.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    public void operation() {
        System.out.print("RefinedAbstraction: ");
        implementor.operationImpl();
    }
}
