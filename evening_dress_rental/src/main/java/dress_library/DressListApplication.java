package dress_library;

import dress_library.console_ui.*;
import dress_library.core.database.Database;
import dress_library.core.database.InMemoryDatabaseImpl;
import dress_library.core.services.AddDressService;
import dress_library.core.services.GetAllDressesService;
import dress_library.core.services.RemoveDressService;

import java.util.Scanner;

public class DressListApplication {
    private static Database database = new InMemoryDatabaseImpl();
    private static AddDressService addDressService = new AddDressService(database);
    private static RemoveDressService removeDressService = new RemoveDressService(database);
    private static GetAllDressesService getAllDressesService = new GetAllDressesService(database);
   private static UIAction addDressUIAction = new AddDressUIAction(addDressService);
    private static UIAction removeDressUIAction = new RemoveDressUIAction(removeDressService);
    private static UIAction getAllDressesUIAction = new GetAllDressesUIAction(getAllDressesService);
    private static UIAction exitUIAction = new ExitUIAction();
    public static void main(String[] args) {
        while (true) {
            printProgramMenu();
            int menuNumber = getMenuNumberFromUser();
            executeSelectedMenuItem(menuNumber);
        }
    }

    private static void printProgramMenu() {
        System.out.println();
        System.out.println("Program menu:");
        System.out.println("1. Add dress to list");
        System.out.println("2. Delete dress from the list");
        System.out.println("3. Show all dresses in the list");
        System.out.println("4. Exit");
        System.out.println();
    }
    private static int getMenuNumberFromUser() {
            System.out.println("Enter menu item number to execute:");
            Scanner scanner = new Scanner(System.in);
            return Integer.parseInt(scanner.nextLine());
    }

    private static void executeSelectedMenuItem(int selectedMenu) {
        switch (selectedMenu) {
            case 1: {

                addDressUIAction.execute();
                break;
            }
            case 2: {
                removeDressUIAction.execute();
                break;
            }
            case 3: {
                getAllDressesUIAction.execute();
                break;
            }
            case 4: {
                exitUIAction.execute();
            }
        }

    }

}
