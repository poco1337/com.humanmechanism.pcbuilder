package System.Classes;

public enum Ram implements CharacteristicsProvider {
    KINGSTON_FURY_BEAST(3199),
    GOODRAM_IRIDIUM_X(5700),
    CORSAIR_VENGEANCE_LPX(3199);
    private final int price;
    private Ram(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String characteristicsToString() {
        return this.toString() + " | ціна: " + this.getPrice();
    }
}
