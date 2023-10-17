package System.Classes;

import Menu.ListOfComponents;

public class Computer implements CharacteristicsProvider {

    int price;
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

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public PcMonitor getPcMonitor() {
        return pcMonitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    private Computer(Computer.Builder builder) {
        this.motherboard = builder.motherboard;
        this.computerCase = builder.computerCase;
        this.pcMonitor = builder.pcMonitor;
        this.mouse = builder.mouse;
        this.keyboard = builder.keyboard;
        this.powerSupply = builder.powerSupply;
        ListOfComponents.computers.add(this);
    }
    public ComputerCase getComputerCase() {
        return this.computerCase;
    }
    public Processor getProcessor() {
        return this.getMotherboard().getProcessor();
    }
    public Motherboard getMotherboard() {
        return this.motherboard;
    }

    public int getPrice() {
        return getMotherboard().getPrice() + getComputerCase().getPrice() + getPcMonitor().getPrice() + getMouse().getPrice() + getKeyboard().getPrice()
            + getPowerSupply().getPrice();
    }

    @Override
    public String characteristicsToString() {
        return toString() + " | motherboard: " + getMotherboard().toString() + " computercase: " + getComputerCase().toString()
            + " | monitor: " + getPcMonitor().toString() + " | mouse:" + getMouse().toString() + " | клава: " + getKeyboard().toString()
            + " | блок живлення: " + getPowerSupply().toString();
    }
}

