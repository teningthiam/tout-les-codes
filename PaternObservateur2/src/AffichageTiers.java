public class AffichageTiers implements Affichage, Observateur {
    private float temperature;
    private float humidite;
    private float pression;

    @Override
    public void actualiser(Sujet sujet) {
        if (sujet instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo) sujet;
            this.temperature = donneesMeteo.getTemperature();
            this.humidite = donneesMeteo.getHumidite();
            this.pression = donneesMeteo.getPression();
            afficher();
        }
    }

    public void afficher() {
        System.out.println("Affichage tiers: Température = " + temperature
                + "°C, Humidité = " + humidite + "%, Pression = " + pression + " hPa");
    }
}
