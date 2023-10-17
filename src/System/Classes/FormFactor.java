package System.Classes;

public enum FormFactor implements CharacteristicsProvider {
    MICROATX, ATX;

    @Override
    public String characteristicsToString() {
        return this.toString();
    }
}