package encheres.Applis;

import encheres.modele.ArticleAVendre;
import encheres.controller.ArticleController;
import encheres.views.EncherisseurLegereView;

import javax.swing.*;
import java.util.Date;

public class EncheresMVCRun {
    public static void main(String[] args) {
        ArticleAVendre article = new ArticleAVendre(1000, new Date());
        EncherisseurLegereView view = new EncherisseurLegereView();

        ArticleController controller = new ArticleController(article, view);

        JFrame frame = new JFrame("Encheres MVC - Gestion des enchères en ligne");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(view);

        // Définir une taille suffisante pour la fenêtre
        frame.setSize(500, 400);

        // Centrer la fenêtre au milieu de l'écran
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
