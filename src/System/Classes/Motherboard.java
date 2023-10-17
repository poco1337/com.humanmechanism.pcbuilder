package System.Classes;

import System.Classes.Disk.Hdd;
import System.Classes.Disk.Ssd;

public class Motherboard implements CharacteristicsProvider {
    private int price;
    final MotherboardModel model;
    Processor processor;
    Videocard videocard;
    Ram ram;
    int countOfMemorySticks;
    Cooling cooling;
    Ssd ssdDisk;
    Hdd hhdDisk;
    SoundCard soundCard;
    public static class Builder {
        MotherboardModel model;
        Processor processor;
        Videocard videocard;
        Ram ram;
        int countOfMemorySticks;
        Cooling cooling;
        Ssd ssdDisk;
        Hdd hhdDisk;
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
            if(countOfMemorySticks <= 4 && countOfMemorySticks > 0) {
                this.countOfMemorySticks = countOfMemorySticks;
                return this;
            }
            else {
                System.out.println("Плашок не повинно бути більше 4 або меньше нуля.");
                return null;
            }
        }
        public Builder cooling(Cooling cooling) {
            this.cooling = cooling;
            return this;
        }
        public Builder hdd(Hdd hdd) {
            this.hhdDisk = hdd;
            return this;
        }
        public Builder ssd(Ssd hdd) {
            this.ssdDisk = hdd;
            return this;
        }
        public Builder soundcard(SoundCard soundCard) {
            this.soundCard = soundCard;
            return this;
        }
        public Motherboard build() {
            return new Motherboard(this);
        }
    }

    public Videocard getVideocard() {
        return videocard;
    }

    public Ram getRam() {
        return ram;
    }

    public int getCountOfMemorySticks() {
        return countOfMemorySticks;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public Ssd getSsdDisk() {
        return ssdDisk;
    }

    public Hdd getHhdDisk() {
        return hhdDisk;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    private Motherboard(Motherboard.Builder builder) {
        this.model = builder.model;
        this.processor = builder.processor;
        this.videocard = builder.videocard;
        this.ram = builder.ram;
        this.countOfMemorySticks = builder.countOfMemorySticks;
        this.cooling = builder.cooling;
        this.hhdDisk = builder.hhdDisk;
        this.ssdDisk = builder.ssdDisk;
        this.soundCard = builder.soundCard;
    }
    public int getPrice() {
        return model.getPrice() + processor.getPrice() + videocard.getPrice() + ram.getPrice() * countOfMemorySticks + cooling.getPrice() + soundCard.getPrice();
    }
    public Processor getProcessor() {
        return this.processor;
    }
    public MotherboardModel getModel() {
        return this.model;
    }

    @Override
    public String characteristicsToString() {
        return this.toString() + " | модель: " + getModel().toString() + " | процесор: " + getProcessor().toString() + getVideocard().toString()
            + getRam().toString() + getCountOfMemorySticks() + getCooling().toString() + getHhdDisk().toString() + getSsdDisk().toString() + getSoundCard().toString();
    }
}
