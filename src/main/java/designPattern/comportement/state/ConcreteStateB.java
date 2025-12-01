package designPattern.comportement.state;

public class ConcreteStateB implements State {
    public void handle(Context context) {
        System.out.println("Etat B");
        context.setState(new ConcreteStateA());
    }
}
