import java.util.Timer;
import java.util.TimerTask;

public class ArticleRun {
    public static void main(String[] args) {
        Article article = new Article(1000);
        Acteur acteur1 = new Acteur("Consommateur 1", 1100);
        Acteur acteur2 = new Acteur("Consommateur 2", 900);
        Acteur acteur3 = new Acteur("Organisme de contrôle", 1200);

        article.addObserver(acteur1);
        article.addObserver(acteur2);
        article.addObserver(acteur3);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                double random = Math.random();
                if (random > 0.5) {
                    article.plusCher();
                } else {
                    article.moinsCher();
                }
            }
        }, 0, 3000);
    }
}
