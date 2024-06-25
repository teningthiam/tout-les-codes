public class Acteur {
    private String nom;
    private Article article;
    private int seuil;

    public Acteur(String nom, Article article, int seuil) {
        this.nom = nom;
        this.article = article;
        this.seuil = seuil;
    }

    public void update() {
        if (article.getPrix() > seuil) {
            System.out.println(nom + " : Le prix actuel " + article.getPrix() + " dépasse le seuil de " + seuil);
        } else {
            System.out.println(nom + " : Le prix actuel " + article.getPrix() + " est en dessous du seuil de " + seuil);
        }
    }
}

