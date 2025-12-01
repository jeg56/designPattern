package designPattern.comportement.observer.method2;

public interface Sujet {
    void ajouterObservateur(Observateur o);
    void supprimerObservateur(Observateur o);
    void notifierObservateurs();
}
