package designPattern.creation.builder;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();
    public void buildPartA() { product.add("PartA"); }
    public void buildPartB() { product.add("PartB"); }
    public Product getResult() { return product; }
}
