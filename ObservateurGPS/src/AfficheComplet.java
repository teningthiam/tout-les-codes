public class AfficheComplet implements Observateur{

    @Override
    public void actualiser(Observable o) {

    }

    @Override
    public void update(String position, String precision, String date) {
        System.out.println("Affichage Complet: Position - " + position + ", Précision - " + precision + ", Date - " + date);
    }
}
