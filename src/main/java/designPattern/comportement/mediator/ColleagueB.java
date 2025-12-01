package designPattern.comportement.mediator;

public class ColleagueB extends Colleague {
    public ColleagueB(Mediator mediator) { super(mediator); }
    public void send(String message) { mediator.send(message, this); }
    public void receive(String message) { System.out.println("ColleagueB reçoit: " + message); }
}
