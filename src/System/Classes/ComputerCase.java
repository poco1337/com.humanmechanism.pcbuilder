package System.Classes;

public enum ComputerCase {
    MSI_MAG_Forge_100M(new FormFactor[]{FormFactor.MICROATX, FormFactor.ATX}, 2499),
    FRONTIER_ASARO_205A(new FormFactor[]{FormFactor.MICROATX, FormFactor.ATX}, 1959),
    DEEPCOOL_CH370_TEMPERED_GLASS(new FormFactor[]{FormFactor.MICROATX}, 3029);
    private final FormFactor[] formFactors;
    private final int price;
    private ComputerCase (FormFactor[] includingFormFactors, int price) {
        this.formFactors = includingFormFactors;
        this.price = price;
    }
}
