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
    }
}