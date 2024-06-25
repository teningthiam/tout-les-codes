package encheres.views;

import encheres.modele.ArticleAVendre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class EncherisseurView extends JFrame implements Observer {
    private ArticleAVendre article;
    private String nom;
    private int seuil;
    private int[] argent;

    private JLabel labelPrix;

    public EncherisseurView(ArticleAVendre article, String nom, int seuil, int argentInitial) {
        this.article = article;
        this.nom = nom;
        this.seuil = seuil;
        this.argent = new int[] { argentInitial };

        setTitle("Encherisseur: " + nom);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel labelNom = new JLabel("Article: " + article.getClass().getSimpleName());
        labelPrix = new JLabel("Prix actuel: " + article.getPrix());

        JTextField textEnchere = new JTextField();
        JButton boutonEncherir = new JButton("Encherir");

        boutonEncherir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int encherirMontant = Integer.parseInt(textEnchere.getText());
                    if (argent[0] >= encherirMontant) {
                        article.inc(encherirMontant);
                        article.setMeilleurEncherisseur(nom);
                        argent[0] -= encherirMontant;
                    } else {
                        JOptionPane.showMessageDialog(null, "Fonds insuffisants");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Veuillez entrer un montant valide.");
                }
            }
        });

        setLayout(new BorderLayout());
        add(labelNom, BorderLayout.NORTH);
        add(labelPrix, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(textEnchere);
        panel.add(boutonEncherir);

        add(panel, BorderLayout.SOUTH);

        // Ajouter cette vue en tant qu'observateur de l'article
        article.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ArticleAVendre) {
            ArticleAVendre articleUpdated = (ArticleAVendre) o;
            labelPrix.setText("Prix actuel: " + articleUpdated.getPrix());
        }
    }

    public static void main(String[] args) {
        ArticleAVendre article = new ArticleAVendre(1000, new Date());
        EncherisseurView view1 = new EncherisseurView(article, "Alice", 1500, 5000);
        EncherisseurView view2 = new EncherisseurView(article, "Bob", 2000, 4000);

        view1.setVisible(true);
        view2.setVisible(true);
    }
}
