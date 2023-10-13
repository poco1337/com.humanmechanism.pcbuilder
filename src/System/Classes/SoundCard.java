package System.Classes;

public enum SoundCard {
    HATOR_CRYSTAL(399),
    ASUS_XONAR_U7(3389);
    private int price;
    SoundCard(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
