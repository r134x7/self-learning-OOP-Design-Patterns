public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Hero mage = new Hero.Builder(Profession.MAGE,"someguy").withArmor(Armor.CLOTHES).withWeapon(Weapon.DAGGER).withHairColor(HairColor.WHITE).withHairType(HairType.SHORT).build();

        Captain captain = new Captain(new FishingBoatAdapter());

        captain.row();

        System.out.println("A simple looking troll approaches.");
        SimpleTroll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.format("Simple troll power: %d.\n", troll.getAttackPower());

        System.out.println("A troll with huge club surprises you.");
        ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.format("Clubbed troll power: %d.\n", clubbedTroll.getAttackPower());

        var messenger = new Messenger();

        System.out.println("Message from the orcs");
        messenger.messageFromOrcs().print();

        System.out.println("Message from the elves: ");
        messenger.messageFromElves().print();

        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        HalflingThief thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();

        System.out.println("\nThe alchemist begins his work.");
        var coin1 = CoinFactory.getCoin(CoinType.COPPER);
        var coin2 = CoinFactory.getCoin(CoinType.GOLD);
        System.out.println(coin1.getDescription());
        System.out.println(coin2.getDescription());

        var factory = new ElfKingdomFactory();
        var castle = factory.createCastle();
        var king = factory.createKing();
        var army = factory.createArmy();

        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());

        
    }
}