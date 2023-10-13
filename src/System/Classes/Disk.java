package System.Classes;

public class Disk {
    private int price;
    private int memory;
    public enum Hdd {
        KINGSTON_NV2_3D_NAND_1TB(1024, 2259),
        KINGSTON_NV2_3D_NAND_500GB(500, 1549);
        Hdd(int memory, int price) {
            Disk disk = new Disk();
            disk.memory = memory;
            disk.price = price;

        }
    }
    public enum Ssd {
        WESTERN_DIGITAL_BLUE(1024, 1699),
        SEAGATE_BARRACUDA(2048, 1999);
        Ssd(int memory, int price) {
            Disk disk = new Disk();
            disk.memory = memory;
            disk.price = price;
        }
    }

    public int getPrice() {
        return price;
    }
}
