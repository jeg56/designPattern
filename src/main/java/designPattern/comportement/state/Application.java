package designPattern.comportement.state;

public class Application {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
    }
}
