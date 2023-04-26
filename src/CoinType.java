import java.util.function.Supplier;

public enum CoinType {

    COPPER(CopperCoin::new),

    GOLD(GoldCoin::new);

    private final Supplier<Coin> constructor;

    CoinType(Supplier<Coin> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Coin> getConstructor() {
        return constructor;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
