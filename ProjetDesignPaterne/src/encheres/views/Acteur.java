package encheres.views;

import encheres.modele.Article;
import java.util.Observable;
import java.util.Observer;

public class Acteur implements Observer {
    private String nom;
    private int seuil;

    public Acteur(String nom, int seuil) {
        this.nom = nom;
        this.seuil = seuil;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Article) {
            Article article = (Article) o;
            int nouveauPrix = (int) arg;
            if (nouveauPrix > seuil) {
                System.out.println(nom + ": Le prix a dépassé le seuil de " + nouveauPrix);
            } else {
                System.out.println(nom + ": Le prix est sous le seuil de " + nouveauPrix);
            }
        }
    }
}
