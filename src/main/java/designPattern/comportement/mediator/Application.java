package designPattern.comportement.mediator;

public class Application {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA a = new ColleagueA(mediator);
        ColleagueB b = new ColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        a.send("Bonjour B");
        b.send("Salut A");
    }
}
