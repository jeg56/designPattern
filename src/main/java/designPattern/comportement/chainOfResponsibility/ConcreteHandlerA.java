package designPattern.comportement.chainOfResponsibility;

public class ConcreteHandlerA extends Handler {
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Traitée par HandlerA");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
