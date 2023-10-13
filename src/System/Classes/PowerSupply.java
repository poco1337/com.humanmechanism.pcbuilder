package System.Classes;

public enum PowerSupply {
    MSI_MAG_650W(650, 2300),
    GIGABYTE_P750GM_750W(750, 3599),
    GIGABYTE_P850GM_850W(850, 4099);
    private final int power;
    private final int price;
    private PowerSupply(int power, int price) {
        this.power = power;
        this.price = price;
    }
}
