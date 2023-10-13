package System.Classes;

public enum Keyboard {
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
}
