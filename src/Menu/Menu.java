package Menu;

import System.Classes.Computer;
import System.Classes.Processor;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static void printMenu() {

        System.out.println("\nМеню. Виберіть функцію:\n1. Зібрати комп'ютер.\n2. Переглянути зібрані збірки.");
        String choiceOfNumberOfFunction = scanner.nextLine();
        switch (choiceOfNumberOfFunction) {
            case "1":
                buildComputer();
                break;
            case "2":
                printMenu();
                break;
            default:
                System.out.println("Виберіть будь ласка ще раз");
                Menu.printMenu();
        }
    }
    public static Computer buildComputer() {
        Processor processor = processorChoice();
        return null;
    }

    private static Processor processorChoice() {
        Processor processor = null;

        for (int i = 0; i < ListOfComponents.processors.length; i++) {
            Processor[] processorsList = ListOfComponents.processors;
            System.out.println(i + ". " + processorsList[i].ToString());
        }
        System.out.print("\nВиберіть процесор: ");

        try {
            processor = ListOfComponents.processors[Integer.parseInt(scanner.next())];
        }
        catch (Exception ex) {
            System.out.println("Виберіть процесор зі списку.");
            processorChoice();
        }

        return processor;
    }
}
