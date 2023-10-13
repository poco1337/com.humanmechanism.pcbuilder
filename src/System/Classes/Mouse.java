package System.Classes;

public enum Mouse {
    LOGITECH_G102_LIGHTSYNC(ConnectionType.WIRED, 8000, 6, 1000, 1299),
    LOGITECH_G_PRO_X_SUPERLIGHT(ConnectionType.WIRELESS, 25000, 5, 1000, 6699),
    RAZER_BASILISK_V3(ConnectionType.WIRED, 26000, 11, 800, 2999);
    public enum ConnectionType {
        WIRED, WIRELESS;
    }
    final ConnectionType connectionType;
    final int maxSensitivity;
    final int numberOfButtons;
    final int surveyFrequency;
    final int price;
    private Mouse(ConnectionType connectionType, int maxSensitivity, int numberOfButtons, int surveyFrequency, int price) {
        this.connectionType = connectionType;
        this.maxSensitivity = maxSensitivity;
        this.numberOfButtons = numberOfButtons;
        this.surveyFrequency = surveyFrequency;
        this.price = price;
    }
}
