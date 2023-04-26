public class FactoryMaker {

    public enum KingdomType {
        ELF, ORC
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        return switch (type) {
            case ELF -> new ElfKingdomFactory();
            case ORC -> new OrcKingdomFactory();
            default -> throw new IllegalArgumentException("KingdomType not supported.");
        };
    }
}
