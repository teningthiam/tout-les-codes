public class AfficheResume implements Observateur{

    @Override
    public void actualiser(Observable o) {

    }

    @Override
    public void update(String position, String precision, String date) {
        System.out.println("Affichage resume : position - " + position+ " precision - " + precision+ " date - " + date);
    }
}
