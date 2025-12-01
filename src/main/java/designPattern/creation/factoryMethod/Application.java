package designPattern.creation.factoryMethod;

public class Application {
    public static void main(String[] args) {
        Creator creator;
        // Switch between product variants via CLI arg: "v2" for ConcreteProductV2
        if (1==1) {
            creator = new ConcreteCreatorV2();
        } else {
            creator = new ConcreteCreator();
        }
        String result = creator.someOperation();
        System.out.println(result);
    }
}
