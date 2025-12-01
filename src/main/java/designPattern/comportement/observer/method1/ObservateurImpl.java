package designPattern.comportement.observer.method1;

public class ObservateurImpl implements Observateur {
    private String nom;
    private String etat;

    public ObservateurImpl(String nom) {
        this.nom = nom;
    }
    @Override
    public void actualiser(String etat) {
        this.etat = etat;
        System.out.println( "Observateur " + this.nom + " : Notification reçue du sujet:" + " Nouvel état : " + this.etat );
    }

    void setNom(String nom) {
        this.nom = nom;
    }
    String getNom() {
        return nom;
    }

    void setEtat(String etat) {
        this.etat = etat;
    }
    String getEtat() {
        return etat;
    }

}
