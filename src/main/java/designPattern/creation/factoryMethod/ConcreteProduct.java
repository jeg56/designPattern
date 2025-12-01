package designPattern.creation.factoryMethod;

public class ConcreteProduct implements Product {
    @Override
    public void use() {
        System.out.println("Utilisation du produit concret");
    }
}
