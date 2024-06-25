import java.util.ArrayList;
import java.util.List;

public class Sujet implements SujetInterface {
    private int etat;
    private List<ObservateurInterface> observateurs;

    public Sujet() {
        this.observateurs = new ArrayList<>();
    }

    @Override
    public void ajouterObservateur(ObservateurInterface observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(ObservateurInterface observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateur() {

    }

    @Override
    public void notifierObservateurs() {
        for (ObservateurInterface observateur : observateurs) {
            observateur.actualiser(this);
        }
    }

    public void setEtat(int etat) {
        this.etat = etat;
        notifierObservateurs();
    }

    public int getEtat() {
        return etat;
    }
}
