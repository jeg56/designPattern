package designPattern.comportement.visitor;

public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) { visitor.visit(this); }
    public void operationB() { System.out.println("Opération B"); }
}
