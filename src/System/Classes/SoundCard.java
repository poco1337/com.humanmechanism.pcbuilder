package System.Classes;

public enum SoundCard implements CharacteristicsProvider {
    HATOR_CRYSTAL(399),
    ASUS_XONAR_U7(3389);
    private int price;
    SoundCard(int price) {
        this.price = price;
    }

    public int getPrice() {
        if(this == null) {
            return 0;
        }
        return price;
    }

    @Override
    public String characteristicsToString() {
        return this.toString() + " | ціна: " + this.getPrice();
    }
}
