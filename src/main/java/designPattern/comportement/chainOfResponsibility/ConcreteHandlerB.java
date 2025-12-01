package designPattern.comportement.chainOfResponsibility;

public class ConcreteHandlerB extends Handler {
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Traitée par HandlerB");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
