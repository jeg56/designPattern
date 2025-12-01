package designPattern.comportement.templateMethod;

public class ConcreteClass extends AbstractClass {
    protected void primitiveOperation1() {
        System.out.println("Opération 1 spécifique");
    }
    protected void primitiveOperation2() {
        System.out.println("Opération 2 spécifique");
    }
}
