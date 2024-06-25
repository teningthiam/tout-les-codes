public class Main {
    public static void main(String[] args) {
        SujetConcret sujet = new SujetConcret();
        ObservateurConcret observateur1 = new ObservateurConcret();
        ObservateurConcret observateur2 = new ObservateurConcret();

        sujet.ajouterObservateur(observateur1);
        sujet.ajouterObservateur(observateur2);

        sujet.changementEtat();  // Cela notifiera tous les observateurs
    }
}
