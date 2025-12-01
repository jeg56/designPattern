package designPattern.structure.facade;

public class Facade {
    private SubsystemA a = new SubsystemA();
    private SubsystemB b = new SubsystemB();
    public void operation() {
        a.operationA();
        b.operationB();
        System.out.println("Opération simplifiée via la façade");
    }
}
