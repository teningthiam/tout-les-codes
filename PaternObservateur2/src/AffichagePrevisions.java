public class AffichagePrevisions implements Affichage, Observateur {
    private float pressionActuelle = 1013.1f; // pression moyenne au niveau de la mer
    private float dernierePression;

    @Override
    public void actualiser(Sujet sujet) {
        if (sujet instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo) sujet;
            dernierePression = pressionActuelle;
            pressionActuelle = donneesMeteo.getPression();
            afficher();
        }
    }

    public void afficher() {
        System.out.print("Prévisions : ");
        if (pressionActuelle > dernierePression) {
            System.out.println("Amélioration des conditions météo !");
        } else if (pressionActuelle == dernierePression) {
            System.out.println("Plus ou moins le même.");
        } else if (pressionActuelle < dernierePression) {
            System.out.println("Attention au mauvais temps !");
        }
    }
}
