package encheres.Strategies;

public class DoNothingStrategy implements encheres.Strategies.Strategy {
    @Override
    public int applyStrategy(int prix) {
        return prix;
    }
}
