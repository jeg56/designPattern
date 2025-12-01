package designPattern.comportement.visitor;

public class ConcreteElementA implements Element {
    public void accept(Visitor visitor) { visitor.visit(this); }
    public void operationA() { System.out.println("Opération A"); }
}
