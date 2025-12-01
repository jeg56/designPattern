package designPattern.comportement.observer.method2;

public class ObservateurImpl implements Observateur {
    private String nom;
    private String etat;

    public ObservateurImpl(String nom) {
        this.nom = nom;
    }


    @Override
    public void actualiser( Sujet sujet) {
        this.etat = etat;
        System.out.println( "Observateur " + this.nom + " : Notification reçue du sujet:" + ((SujetImpl) sujet).getEtat() + " / Num changement :" + ((SujetImpl) sujet).getNbChange());
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


}
