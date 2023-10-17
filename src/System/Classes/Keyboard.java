package System.Classes;

public enum Keyboard implements CharacteristicsProvider {
    DARK_PROJECT_ONE(ConnectionType.WIRED, 1990),
    HATOR_SKYFALL_TKL_PRO(ConnectionType.WIRELESS, 4199);
    public enum ConnectionType {
        WIRED, WIRELESS;
    }
    final int price;
    final ConnectionType connectionType;
    private Keyboard(ConnectionType connectionType, int price) {
        this.connectionType = connectionType;
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
