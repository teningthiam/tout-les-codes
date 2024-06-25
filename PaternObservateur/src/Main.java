public class Main {
    public static void main(String[] args) {
        Sujet sujet = new Sujet();
        Observateur observateur1 = new Observateur();
        Observateur observateur2 = new Observateur();

        sujet.ajouterObservateur(observateur1);
        sujet.ajouterObservateur(observateur2);

        sujet.setEtat(1);  // Cela notifiera tous les observateurs
    }
}
