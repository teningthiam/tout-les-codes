public class OrganismeSurveillance extends Acteur {
    public OrganismeSurveillance(String nom, int seuil) {
        super(nom, seuil);
    }

    @Override
    public void update(Observable o, Object arg) {
        Article article = (Article) o;
        if (article.getPrix() > getSeuil()) {
            System.out.println(getNom() + " : Alerte déclenchée, prix = " + article.getPrix());
        }
    }
}