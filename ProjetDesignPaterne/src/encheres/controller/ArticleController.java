package encheres.controller;

import encheres.modele.ArticleAVendre;
import encheres.views.EncherisseurLegereView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArticleController {
    private ArticleAVendre article;
    private EncherisseurLegereView view;

    public ArticleController(ArticleAVendre article, EncherisseurLegereView view) {
        this.article = article;
        this.view = view;

        view.getBoutonEncherir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int encherirMontant = Integer.parseInt(view.getTextEnchere().getText());
                article.inc(encherirMontant);
                view.getLabelPrix().setText("Prix actuel: " + article.getPrix());
            }
        });
    }
}
