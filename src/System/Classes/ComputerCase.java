package System.Classes;

import java.util.Arrays;

public enum ComputerCase implements CharacteristicsProvider{
    MSI_MAG_Forge_100M(new FormFactor[]{FormFactor.MICROATX, FormFactor.ATX}, 2499),
    FRONTIER_ASARO_205A(new FormFactor[]{FormFactor.MICROATX, FormFactor.ATX}, 1959),
    DEEPCOOL_CH370_TEMPERED_GLASS(new FormFactor[]{FormFactor.MICROATX}, 3029);
    private final FormFactor[] formFactors;
    private final int price;
    private ComputerCase (FormFactor[] includingFormFactors, int price) {
        this.formFactors = includingFormFactors;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
@Override
    public String characteristicsToString() {
        return this.toString() + " | Підтримуючі форм-фактори: " + Arrays.toString(this.formFactors) + " | ціна: " + this.getPrice();
    }

    public FormFactor[] getFormFactors() {
        return formFactors;
    }
}
