package encheres.Strategies;

public class ArrondieStrategy implements encheres.Strategies.Strategy {
    @Override
    public int applyStrategy(int prix) {
        return ((prix + 99) / 100) * 100;
    }
}
