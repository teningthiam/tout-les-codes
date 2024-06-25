public class Main {
    public static void main(String[] args) {
        DonneesMeteo donneesMeteo = new DonneesMeteo();

        AffichageConditions affichageConditions = new AffichageConditions();
        AffichageStats affichageStats = new AffichageStats();
        AffichageTiers affichageTiers = new AffichageTiers();
        AffichagePrevisions affichagePrevisions = new AffichagePrevisions();

        donneesMeteo.enregistrerObservateur(affichageConditions);
        donneesMeteo.enregistrerObservateur(affichageStats);
        donneesMeteo.enregistrerObservateur(affichageTiers);
        donneesMeteo.enregistrerObservateur(affichagePrevisions);

        // Simuler de nouvelles mesures météorologiques
        donneesMeteo.getMesures(25.5f, 65.0f, 1013.1f);
        donneesMeteo.getMesures(27.2f, 70.0f, 1012.5f);
        donneesMeteo.getMesures(23.4f, 68.0f, 1011.0f);
    }
}
