package designPattern.comportement.observer.method2;

import java.util.ArrayList;

public class SujetImpl implements Sujet {
    private String etat;
    private int nbChange = 0;
    ArrayList <Observateur> observateurs = new ArrayList<>();

    @Override
    public void ajouterObservateur(Observateur o) {
        this.observateurs.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        this.observateurs.remove(o);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur obs : observateurs) {
            obs.actualiser(this);
        }
    }
    public void setEtat( String etat) {
        this.etat = etat;
        this.nbChange++;
        notifierObservateurs();
    }
    public String getEtat() {
        return etat;
    }

    public int getNbChange() {
        return nbChange;
    }
}
