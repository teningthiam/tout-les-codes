import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Sujet{
    private float temperature;
    private float humidite;
    private float pression;
    private List<Observateur> observateurs;

    public DonneesMeteo(){
        this.observateurs= new ArrayList<>();
    }

    @Override
    public void enregistrerObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void notifierObservateurs(){
        for(Observateur observateur : observateurs)
            observateur.actualiser(this);
    }

    @Override
    public void supprimerObservateeur(Observateur observateur) {
        observateurs.remove(observateur);
    }
    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        mesuresMiseAJour();
    }

    public float getTemperature(){
        return temperature;
    }
    public float getHumidite(){
        return humidite;
    }
    public float getPression(){
        return pression;
    }
    public void getMesures(float t, float h, float p){
        this.temperature = t;
        this.humidite = h;
        this.pression = p;
    }
    private void mesuresMiseAJour() {
        notifierObservateurs();
    }
}
