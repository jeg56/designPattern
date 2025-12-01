package designPattern.creation.factoryMethod;

public class ConcreteProduct implements Product {
    @Override
    public String operation() {
        return "ConcreteProduct: operation result";
    }
}
