package System.Classes;

public class Motherboard {
    private int price;
    final MotherboardModel model;
    Processor processor;
    Videocard videocard;
    Ram ram;
    int countOfMemorySticks;
    Cooling cooling;
    Disk disk;
    SoundCard soundCard;
    public static class Builder {
        MotherboardModel model;
        Processor processor;
        Videocard videocard;
        Ram ram;
        int countOfMemorySticks;
        Cooling cooling;
        Disk disk;
        SoundCard soundCard;

        public Builder motherboardModel(MotherboardModel model) {
            this.model = model;
            return this;
        }
        public Builder processor(Processor processor) {
            this.processor = processor;
            return this;
        }
        public Builder videocard(Videocard videocard) {
            this.videocard = videocard;
            return this;
        }
        public Builder ram(Ram ram) {
            this.ram = ram;
            return this;
        }
        public Builder countOfMemorySticks(int countOfMemorySticks) {
            if(countOfMemorySticks <= 4) {
                this.countOfMemorySticks = countOfMemorySticks;
                return this;
            }
            else {
                System.out.println("Плашок не повинно бути більше 4");
                return null;
            }
        }
        public Builder cooling(Cooling cooling) {
            this.cooling = cooling;
            return this;
        }
        public Builder disk(Disk disk) {
            this.disk = disk;
            return this;
        }
        public Builder soundcard(SoundCard soundCard) {
            this.soundCard = soundCard;
            return this;
        }
        public Motherboard build() {
            if(processor == null) {
                throw new IllegalStateException("Penis");
            }
            return new Motherboard(this);
        }
    }
    private Motherboard(Motherboard.Builder builder) {
        this.model = builder.model;
        this.processor = builder.processor;
        this.videocard = builder.videocard;
        this.ram = builder.ram;
        this.countOfMemorySticks = builder.countOfMemorySticks;
        this.cooling = builder.cooling;
        this.disk = builder.disk;
        this.soundCard = builder.soundCard;
        this.price = getPrice();
    }
    public int getPrice() {
        return model.getPrice() + processor.getPrice() + videocard.getPrice() + ram.getPrice() * countOfMemorySticks + cooling.getPrice() + disk.getPrice() + soundCard.getPrice();
    }
}
