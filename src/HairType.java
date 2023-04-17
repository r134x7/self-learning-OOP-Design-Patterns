public enum HairType {

    BALD,
    CURLY,
    LONG_CURLY,
    LONG_STRAIGHT,
    SHORT;

    private String title;

    @Override
    public String toString() {
        return "HairType{" +
                "title='" + title + '\'' +
                '}';
    }
}
