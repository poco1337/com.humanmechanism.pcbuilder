package System.Classes;

public enum PowerSupply implements CharacteristicsProvider{
    MSI_MAG_650W(650, 2300),
    GIGABYTE_P750GM_750W(750, 3599),
    GIGABYTE_P850GM_850W(850, 4099);
    private final int power;
    private final int price;

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }

    private PowerSupply(int power, int price) {
        this.power = power;
        this.price = price;
    }

    @Override
    public String characteristicsToString() {
        return toString() + " | ваттаж: " + getPower() + " | ціна: " + getPrice();
    }
}
