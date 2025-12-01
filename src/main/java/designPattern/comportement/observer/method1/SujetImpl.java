package designPattern.comportement.observer.method1;

import java.util.ArrayList;

public class SujetImpl implements Sujet {
    private String etat;
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
            obs.actualiser(this.getEtat());
        }
    }
    public void setEtat(String etat) {
        this.etat = etat;
        notifierObservateurs();
    }
    public String getEtat() {
        return etat;
    }
}
