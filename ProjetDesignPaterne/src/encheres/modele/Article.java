package encheres.modele;

import java.util.Observable;

public class Article extends Observable {
    private int prix;

    public Article(int prixInitial) {
        this.prix = prixInitial;
    }

    public int getPrix() {
        return prix;
    }

    public void plusCher() {
        prix += 100;
        setChanged();
        notifyObservers(prix);
    }

    public void moinsCher() {
        prix -= 100;
        setChanged();
        notifyObservers(prix);
    }
}
