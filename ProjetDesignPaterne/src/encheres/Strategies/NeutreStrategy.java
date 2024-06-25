package encheres.Strategies;

public class NeutreStrategy implements encheres.Strategies.Strategy {
    @Override
    public int applyStrategy(int prix) {
        return prix;
    }
}
