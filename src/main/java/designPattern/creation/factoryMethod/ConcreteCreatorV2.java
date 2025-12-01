package designPattern.creation.factoryMethod;

public class ConcreteCreatorV2 extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductV2();
    }
}
