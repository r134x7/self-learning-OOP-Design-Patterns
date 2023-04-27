import com.sun.jdi.IntegerValue;

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

        System.out.println("Green dragon spotted ahead!");
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        System.out.println("Red dragon emerges!");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        System.out.println("Blue dragon emerges!");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        var enumIvoryTower1 = EnmIvoryTower.INSTANCE;
        var enumIvoryTower2 = EnmIvoryTower.INSTANCE;
        System.out.printf("enumIvoryTower1=%s\n", enumIvoryTower1);
        System.out.printf("enumIvoryTower2=%s\n", enumIvoryTower2);

        System.out.println("Inside main()");
        Resource<Integer> ir = IntegerSingleton.instance();
        Resource<Integer> ir2 = IntegerSingleton.instance();
        SingletonPattern.show(ir);
        SingletonPattern.put(ir2, Integer.valueOf(9));
        SingletonPattern.show(ir);
    }
}