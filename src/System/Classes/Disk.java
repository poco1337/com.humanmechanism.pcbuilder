package System.Classes;

public class Disk implements CharacteristicsProvider{
    private int price;

    public int getMemory() {
        return memory;
    }

    private int memory;
    public enum Hdd implements CharacteristicsProvider{
        KINGSTON_NV2_3D_NAND_1TB(1024, 2259),
        KINGSTON_NV2_3D_NAND_500GB(500, 1549);
        private Hdd(int memory, int price) {
            Disk disk = new Disk();
            disk.memory = memory;
            disk.price = price;

        }

        @Override
        public String characteristicsToString() {
            Disk disk = new Disk();
            return this.toString() + " | к-сть гб" + disk.getMemory() + " | ціна: " + disk.getPrice();
        }
    }
    public enum Ssd implements CharacteristicsProvider{
        WESTERN_DIGITAL_BLUE(1024, 1699),
        SEAGATE_BARRACUDA(2048, 1999);
        private Ssd(int memory, int price) {
            Disk disk = new Disk();
            disk.memory = memory;
            disk.price = price;
        }
        @Override
        public String characteristicsToString() {
            Disk disk = new Disk();
            return this.toString() + " | к-сть гб" + disk.getMemory() + " | ціна: " + disk.getPrice();
        }

    }

    public String characteristicsToString() {
        return null;
    }
    public int getPrice() {
        return price;
    }
}
