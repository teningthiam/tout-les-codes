public class ArticleAVendre extends Article {
    private String meilleurEncherisseur;

    public ArticleAVendre(int prixInitial) {
        super(prixInitial);
    }

    public String getMeilleurEncherisseur() {
        return meilleurEncherisseur;
    }

    public void setMeilleurEncherisseur(String encherisseur) {
        this.meilleurEncherisseur = encherisseur;
        setChanged();
        notifyObservers();
    }

    public void inc(int enPlus) {
        setPrix(prix + enPlus);
    }
}
