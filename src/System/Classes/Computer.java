package System.Classes;

public class Computer {

    Motherboard motherboard;
    PowerSupply powerSupply;
    ComputerCase computerCase;
    PcMonitor pcMonitor;
    Keyboard keyboard;
    Mouse mouse;
    public static class Builder {
        Motherboard motherboard;
        PowerSupply powerSupply;
        ComputerCase computerCase;
        PcMonitor pcMonitor;
        Keyboard keyboard;
        Mouse mouse;
        public Builder motherboard(Motherboard motherboard) {
            this.motherboard = motherboard;
            return this;
        }
        public Builder powerSupply(PowerSupply powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }
        public Builder computerCase(ComputerCase computerCase) {
            this.computerCase = computerCase;
            return this;
        }
        public Builder pcMonitor(PcMonitor pcMonitor) {
            this.pcMonitor = pcMonitor;
            return this;
        }
        public Builder keyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder mouse(Mouse mouse) {
            this.mouse = mouse;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
    private Computer(Computer.Builder builder) {
        this.motherboard = builder.motherboard;
        this.computerCase = builder.computerCase;
        this.pcMonitor = builder.pcMonitor;
        this.mouse = builder.mouse;
        this.keyboard = builder.keyboard;
        this.powerSupply = builder.powerSupply;
    }

}

