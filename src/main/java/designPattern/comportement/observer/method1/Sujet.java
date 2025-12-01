package designPattern.comportement.observer.method1;

public interface Sujet {
    void ajouterObservateur(Observateur o);
    void supprimerObservateur(Observateur o);
    void notifierObservateurs();
}
