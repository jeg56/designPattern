package designPattern.comportement.mediator;

public class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator) { super(mediator); }
    public void send(String message) { mediator.send(message, this); }
    public void receive(String message) { System.out.println("ColleagueA reçoit: " + message); }
}
