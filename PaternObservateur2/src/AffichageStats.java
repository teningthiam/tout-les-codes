public class AffichageStats implements Affichage, Observateur {
    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0.0f;
    private int numReadings;

    @Override
    public void actualiser(Sujet sujet) {
        if (sujet instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo) sujet;
            float temp = donneesMeteo.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }
            afficher();
        }
    }

    public void afficher() {
        System.out.println("Statistiques de température: Moyenne = " + (tempSum / numReadings)
                + "°C, Max = " + maxTemp + "°C, Min = " + minTemp + "°C");
    }
}
