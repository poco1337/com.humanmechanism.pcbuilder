package System.Classes;

public enum Mouse implements CharacteristicsProvider{
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

    public int getMaxSensitivity() {
        return maxSensitivity;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public int getSurveyFrequency() {
        return surveyFrequency;
    }

    public int getPrice() {
        return price;
    }

    private Mouse(ConnectionType connectionType, int maxSensitivity, int numberOfButtons, int surveyFrequency, int price) {
        this.connectionType = connectionType;
        this.maxSensitivity = maxSensitivity;
        this.numberOfButtons = numberOfButtons;
        this.surveyFrequency = surveyFrequency;
        this.price = price;
    }
    public String characteristicsToString() {
        return this.toString() + " | тип під'єднання: " + this.getConnectionType() + " | дпі: " + getMaxSensitivity() + " | кількість кнопок:" + getNumberOfButtons() + " | частота оновлення:" + getSurveyFrequency() + " | ціна: " + getPrice();
    }
    public ConnectionType getConnectionType() {
        return this.connectionType;
    }
}
