package Menu;

import System.Classes.Computer;
import System.Classes.ComputerCase;
import System.Classes.Cooling;
import System.Classes.Disk.Hdd;
import System.Classes.Disk.Ssd;
import System.Classes.Keyboard;
import System.Classes.Mouse;
import System.Classes.PcMonitor;
import System.Classes.PowerSupply;
import System.Classes.Processor;
import System.Classes.Ram;
import System.Classes.SoundCard;
import System.Classes.Videocard;
import java.util.List;

public class ListOfComponents {
    public final static Processor[] processors = Processor.values();
    public final static Videocard[] videocards = Videocard.values();
    public final static Ram[] rams = Ram.values();
    public final static PowerSupply[] powerSupplies = PowerSupply.values();
    public final static PcMonitor[] pcMonitor = PcMonitor.values();
    public final static Mouse[] mouses = Mouse.values();
    public final static Keyboard[] keyboards = Keyboard.values();
    public final static Hdd[] hddDisks = Hdd.values();
    public final static Ssd[] ssdDisks = Ssd.values();
    public final static Cooling[] coolings = new Cooling[Cooling.values().length + 1];
    public final static ComputerCase[] computerCases = ComputerCase.values();
    public final static SoundCard[] soundCards = new SoundCard[SoundCard.values().length +1];
    public static List<Computer> computers;
}
