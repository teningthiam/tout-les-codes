public interface Sujet {

    public void enregistrerObservateur(Observateur observateur);
    public void supprimerObservateeur(Observateur observateur);
    public void notifierObservateurs();

}
