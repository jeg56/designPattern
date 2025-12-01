package designPattern.comportement.observer.method2;

public class Application {
    public static void main(String[] args) {
        SujetImpl sujet = new SujetImpl();

        Observateur obs1 = new ObservateurImpl("obs1");
        Observateur obs2 = new ObservateurImpl("obs2");

        sujet.ajouterObservateur(obs1);
        sujet.ajouterObservateur(obs2);

        System.out.println("MAJ état à 1");
        sujet.setEtat("Nouvel état 1");
        System.out.println("---------------------------------------------------");

        System.out.println("MAJ état à 2");
        sujet.setEtat("Nouvel état 2");
        System.out.println("---------------------------------------------------");

        sujet.supprimerObservateur(obs1);

        System.out.println("MAJ état à 3");
        sujet.setEtat("Nouvel état 3");
    }
}
