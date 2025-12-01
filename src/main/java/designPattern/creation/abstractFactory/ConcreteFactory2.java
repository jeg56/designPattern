package designPattern.creation.abstractFactory;

//Produit les produits de la famille 2 compatible entre eux
public class ConcreteFactory2 implements AbstractFactory {
    public ProductA createProductA() { return new ProductA2(); }
    public ProductB createProductB() { return new ProductB2(); }
}
