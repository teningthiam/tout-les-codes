interface SujetInterface{
    public void ajouterObservateur(ObservateurInterface $observateur);
    public void supprimerObservateur(ObservateurInterface $observateur);
    public void notifierObservateur();

    void notifierObservateurs();
}
interface ObservateurInterface{
    public void actualiser(SujetInterface $sujet);
}
