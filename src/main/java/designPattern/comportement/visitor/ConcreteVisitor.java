package designPattern.comportement.visitor;

public class ConcreteVisitor implements Visitor {
    public void visit(ConcreteElementA element) { element.operationA(); }
    public void visit(ConcreteElementB element) { element.operationB(); }
}
