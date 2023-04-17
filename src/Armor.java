public enum Armor {

    CHAIN_MAIL,
    CLOTHES,
    LEATHER,
    PLATE_MAIL;

    private String title;

    @Override
    public String toString() {
        return "Armor{" +
                "title='" + title + '\'' +
                '}';
    }


}
