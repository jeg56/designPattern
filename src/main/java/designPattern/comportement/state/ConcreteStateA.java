package designPattern.comportement.state;

public class ConcreteStateA implements State {
    public void handle(Context context) {
        System.out.println("Etat A");
        context.setState(new ConcreteStateB());
    }
}
