package designPattern.creation.builder;

public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
