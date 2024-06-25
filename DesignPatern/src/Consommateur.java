public class Consommateur extends Acteur {
    public Consommateur(String nom, int seuil) {
        super(nom, seuil);
    }

    @Override
    public void update(Observable o, Object arg) {
        Article article = (Article) o;
        if (article.getPrix() < getSeuil()) {
            System.out.println(getNom() + " : Demande d'achat déclenchée, prix = " + article.getPrix());
        }
    }
}


