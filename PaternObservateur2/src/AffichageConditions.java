public class AffichageConditions implements Affichage, Observateur{

    private float temperature;
    private float humidite;

    @Override
    public void actualiser(Sujet sujet) {
        if (sujet instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo) sujet;
            this.temperature = donneesMeteo.getTemperature();
            this.humidite = donneesMeteo.getHumidite();
            afficher();
        }
    }
        public void afficher(){
            System.out.println("Conditions actuelles: " + temperature + "°C et " + humidite + "% d'humidité");
        }
}
