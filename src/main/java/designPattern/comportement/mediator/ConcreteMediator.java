package designPattern.comportement.mediator;

public class ConcreteMediator implements Mediator {
    private ColleagueA a;
    private ColleagueB b;
    public void setColleagueA(ColleagueA a) { this.a = a; }
    public void setColleagueB(ColleagueB b) { this.b = b; }
    public void send(String message, Colleague colleague) {
        if (colleague == a) {
            b.receive(message);
        } else {
            a.receive(message);
        }
    }
}
