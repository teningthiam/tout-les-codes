package encheres.modele;

import java.util.Date;

public class ArticleAVendre extends Article {
    private Date dateFermeture;
    private String meilleurEncherisseur;

    public ArticleAVendre(int prixInitial, Date dateFermeture) {
        super(prixInitial);
        this.dateFermeture = dateFermeture;
    }

    public void augmenterPrix(int enPlus) {
        int nouveauPrix = getPrix() + enPlus;
        setChanged();
        notifyObservers(nouveauPrix);
    }

    public Date getDateFermeture() {
        return dateFermeture;
    }

    public String getMeilleurEncherisseur() {
        return meilleurEncherisseur;
    }

    public void setMeilleurEncherisseur(String meilleurEncherisseur) {
        this.meilleurEncherisseur = meilleurEncherisseur;
    }
}
