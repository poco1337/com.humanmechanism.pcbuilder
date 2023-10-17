package System.Classes;

public enum PcMonitor implements CharacteristicsProvider {
    ASUS_TUF_GAMING_VG249Q1R(Resolution.FULL_HD, MatrixType.IPS, UpdateFrequency.HZ165, 6799),
    ASUS_TUF_GAMING_VG27AQL1A(Resolution.QUAD_HD, MatrixType.IPS, UpdateFrequency.HZ165, 13999),
    ASUS_TUF_GAMING_VG27AQA1A(Resolution.QUAD_HD, MatrixType.VN, UpdateFrequency.HZ165, 10799),
    CORSAIR_XENEON_27QHD240(Resolution.QUAD_HD, MatrixType.OLED, UpdateFrequency.HZ60, 50999);
    final int price;
    final Resolution resolution;
    final MatrixType matrixType;
    final UpdateFrequency updateFrequency;
    public enum Resolution {
        FULL_HD, QUAD_HD;
    }
    public enum MatrixType {
        IPS, OLED, VN;
    }
    public enum UpdateFrequency {
        HZ60, HZ165
    }

    public Resolution getResolution() {
        return resolution;
    }

    public int getPrice() {
        return price;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    public UpdateFrequency getUpdateFrequency() {
        return updateFrequency;
    }

    private PcMonitor(Resolution resolution, MatrixType matrixType, UpdateFrequency updateFrequency, int price) {
        this.resolution = resolution;
        this.matrixType = matrixType;
        this.updateFrequency = updateFrequency;
        this.price = price;

    }
    @Override
    public String characteristicsToString() {
        return toString() + " | к-сть пікселів: " + getResolution() + " | тип матриці: " + getMatrixType() + " | частота оновлення: " + getUpdateFrequency() + " | ціна: " + getPrice();
    }
}
