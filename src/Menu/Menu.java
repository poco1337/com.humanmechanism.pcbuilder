package Menu;

import System.Classes.CharacteristicsProvider;
import System.Classes.Computer;
import System.Classes.Computer.Builder;
import System.Classes.ComputerCase;
import System.Classes.Cooling;
import System.Classes.Disk;
import System.Classes.Disk.Hdd;
import System.Classes.Disk.Ssd;
import System.Classes.Keyboard;
import System.Classes.Motherboard;
import System.Classes.MotherboardModel;
import System.Classes.Mouse;
import System.Classes.PcMonitor;
import System.Classes.PowerSupply;
import System.Classes.Processor;
import System.Classes.Ram;
import System.Classes.SoundCard;
import System.Classes.Videocard;
import java.util.Scanner;

public class Menu {
    private static final String redColorCode = "\u001B[31m";
    private static final String resetColorCode = "\u001B[0m";
    private static Scanner scanner = new Scanner(System.in);
    public static void printMenu() {

        System.out.println("\nМеню. Виберіть функцію:\n1. Зібрати комп'ютер.\n2. Переглянути зібрані збірки.");
        String choiceOfNumberOfFunction = scanner.nextLine();
        switch (choiceOfNumberOfFunction) {
            case "1":
                buildComputer();
                break;
            case "2":
                printComputers();
                break;
            default:
                System.out.println("Виберіть будь ласка ще раз");
                Menu.printMenu();
                break;
        }
        printMenu();
    }
    private static void printComputers() {
        System.out.println(ListOfComponents.computers.get(2).characteristicsToString() + " | ціна:" + ListOfComponents.computers.get(2).getPrice());
    }
    private static Computer buildComputer() {
        Motherboard motherboard;
        Computer computer;
        ComputerCase computerCase = computerCaseChoice();
        computer = new Builder().computerCase(computerCase).build();

        MotherboardModel motherboardModel = motherboardModelChoice();
        motherboard = new Motherboard.Builder().motherboardModel(motherboardModel).build();
        computer = new Builder().computerCase(computerCase).motherboard(motherboard).build();

        Processor processor = processorChoice();
        Videocard videocard = videocardChoice();
        Ram ram = ramChoice();

        System.out.println("Виберіть кількість плашок: ");
        int countOfMemorySticks = scanner.nextInt();

        SoundCard soundCard = soundCardChoice();
        PowerSupply powerSupply = powerSupplyChoice();
        PcMonitor pcMonitor = pcMonitorChoice();
        Mouse mouse = mouseChoice();
        Keyboard keyboard = keyboardChoice();
        Cooling cooling = coolingChoice();
        Ssd ssd = ssdChoice();
        Hdd hdd = hhdChoice();
        motherboard = new Motherboard.Builder().motherboardModel(motherboardModel).processor(processor).videocard(videocard).ram(ram).ssd(ssd).countOfMemorySticks(countOfMemorySticks).cooling(cooling).soundcard(soundCard).hdd(hdd).build();
        System.out.println("Ви зібрали комп'ютер!");

        return new Builder().computerCase(computerCase).motherboard(motherboard).powerSupply(powerSupply).pcMonitor(pcMonitor).keyboard(keyboard).mouse(mouse).build();
    }

    private static <T extends CharacteristicsProvider> T componentChoice(T[] components, String prompt) {
        T component = null;

        for (int i = 0; i < components.length; i++) {
            if(components[0] instanceof MotherboardModel) {
                MotherboardModel motherboardModel = (MotherboardModel) components[i];
                for(int j = 0; j < ListOfComponents.computers.get(0).getComputerCase().getFormFactors().length; j++) {
                    ComputerCase computerCase = ListOfComponents.computers.get(0).getComputerCase();
                    if(computerCase.getFormFactors()[j] == motherboardModel.getFormFactor()) {
                        System.out.println(i + ". " + components[i].characteristicsToString());
                    }

                }
            }
            else if (components[0] instanceof Processor) {
                Processor processor = (Processor)components[i];
                if(ListOfComponents.computers.get(1).getMotherboard().getModel().getSocket() == processor.getSocket()) {
                    System.out.println(i + ". " + components[i].characteristicsToString());
                }
            }
            else {
                System.out.println(i + ". " + components[i].characteristicsToString());
            }
        }
        if(components[0] instanceof SoundCard || components[0] instanceof Cooling) {
            System.out.println(components.length + ". Не вибирати");
        }

        System.out.print(prompt);
        int choice;
        try {
            choice = Integer.parseInt(scanner.next());
            if (choice == components.length && (components[0] instanceof SoundCard || components[0] instanceof Cooling)) {
                return component;
            }
            component = components[choice];
        } catch (Exception ex) {
            System.out.println("Виберіть компонент зі списку.");
            return componentChoice(components, prompt);
        }

        return component;
    }
    private static Hdd hhdChoice() {
        return componentChoice(ListOfComponents.hddDisks, "Виберіть hdd: ");
    }
    private static Ssd ssdChoice() {
        return componentChoice(ListOfComponents.ssdDisks, "Виберіть ssd: ");
    }

    private static Processor processorChoice() {
        return componentChoice(ListOfComponents.processors, "Виберіть процесор: ");
    }

    private static Videocard videocardChoice() {
        return componentChoice(ListOfComponents.videocards, "Виберіть відеокарту: ");
    }
    private static SoundCard soundCardChoice() {
        return componentChoice(ListOfComponents.soundCards, "Виберіть звукову карту: ");
    }
    private static Ram ramChoice() {
        return componentChoice(ListOfComponents.rams, "Виберіть оперативну пам'ять: ");
    }
    private static MotherboardModel motherboardModelChoice() {
        return componentChoice(ListOfComponents.motherboardModels, "Виберіть модель мами: ");
    }

    private static ComputerCase computerCaseChoice() {
        return componentChoice(ListOfComponents.computerCases, "Виберіть корпус: ");
    }
    private static PowerSupply powerSupplyChoice() {
        return componentChoice(ListOfComponents.powerSupplies, "Виберіть модель блока живлення: ");
    }
    private static PcMonitor pcMonitorChoice() {
        return componentChoice(ListOfComponents.pcMonitor, "Виберіть модель монітору: ");
    }
    private static Mouse mouseChoice() {
        return componentChoice(ListOfComponents.mouses, "Виберіть модель миші: ");
    }
    private static Keyboard keyboardChoice() {
        return componentChoice(ListOfComponents.keyboards, "Виберіть модель клавіатури: ");
    }
    private static Cooling coolingChoice() {
        return componentChoice(ListOfComponents.coolings, "Виберіть модель охолодження: ");
    }

}
