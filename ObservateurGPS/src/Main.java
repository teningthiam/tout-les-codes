public class Main {
    public static void main(String[] args) {
        Gps gps = new Gps();
        AfficheResume afficheResume = new AfficheResume();
        AfficheComplet afficheComplet = new AfficheComplet();

        gps.ajouterObservateur(afficheResume);
        gps.ajouterObservateur(afficheComplet);

        gps.setPosition("48.8566 N, 2.3522 E");
        gps.setPrecision("10 mètres");
        gps.setDate("2024-06-25 12:34:56");
    }
}