package encheres.Strategies;

public class RalentieStrategy implements encheres.Strategies.Strategy {
    @Override
    public int applyStrategy(int prix) {
        return (int) (prix * 0.9);
    }
}
