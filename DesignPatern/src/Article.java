public class Article {
    private int prix;

    public Article(int prixInitial) {
        this.prix = prixInitial;
    }

    public int getPrix() {
        return prix;
    }

    public void plusCher() {
        prix += 100;
    }

    public void moinsCher() {
        prix -= 100;
    }

}
