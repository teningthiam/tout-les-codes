package encheres.Applis;

import encheres.modele.ArticleAVendre;
import encheres.views.EncherisseurView;

import java.util.Date;

public class ePay {
    public static void main(String[] args) {
        ArticleAVendre article = new ArticleAVendre(1000, new Date());

        EncherisseurView view1 = new EncherisseurView(article, "Moussa", 1500, 5000);
        EncherisseurView view2 = new EncherisseurView(article, "Fama", 2000, 4000);

        view1.setVisible(true);
        view2.setVisible(true);
    }
}
