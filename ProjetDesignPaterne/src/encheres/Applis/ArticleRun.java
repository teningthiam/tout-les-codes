package encheres.Applis;

import encheres.modele.Article;
import encheres.views.Acteur;

public class ArticleRun {
    public static void main(String[] args) throws InterruptedException {
        Article article = new Article(1000);

        Acteur moussaNdiaye = new Acteur("Moussa Ndiaye", 1200);
        Acteur famaSow = new Acteur("Fama Sow", 1100);
        Acteur annaNdiaye = new Acteur("Anna Ndiayee", 1150);

        article.addObserver(moussaNdiaye);
        article.addObserver(famaSow);
        article.addObserver(annaNdiaye);

        // Simulation des changements de prix
        for (int i = 0; i < 10; i++) {
            if (Math.random() > 0.5) {
                article.plusCher();
            } else {
                article.moinsCher();
            }
            Thread.sleep(3000);
        }
    }
}
