public class Observateur implements ObservateurInterface {
    @Override
    public void actualiser(SujetInterface sujet) {
        System.out.println("Le sujet a changé d'état : " + ((Sujet) sujet).getEtat());
    }
}
