package designPattern.comportement.memento;

public class Application {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("Etat1");
        caretaker.setMemento(originator.saveState());
        originator.setState("Etat2");
        System.out.println("Etat courant: " + originator.getState());
        originator.restoreState(caretaker.getMemento());
        System.out.println("Etat restauré: " + originator.getState());
    }
}
