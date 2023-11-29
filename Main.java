import Command.Access;
import ToyRoom.ToyRoom;

import java.util.Scanner;

import MainMenu.MainMenu;


import static ToyRoom.ToyRoom.toys;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ToyRoom toyRoom = new ToyRoom();
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(toyRoom, null);
        System.out.println("Enter your access to get started:");
        Access access1 = new Access();
        access1.execute(toys);
        int access = Access.accessForUse;

        while (true) {
            if (access == 1) {
                System.out.print("Select an action:\n " +
                        "   Add toy\n" +
                        "    Remove toy\n" +
                        "    Write all the toys\n" +
                        "    Access\n");
            } else if (access == 2) {
                System.out.print("Select an action:\n " +
                        "   Enter budget\n" +
                        "    Buy toys for room\n" +
                        "    Print buy toys\n" +
                        "    Remove the toy from the purchase\n" +
                        "    Sort toys\n" +
                        "    Search toy\n" +
                        "    Access\n");
            }

            System.out.println("Choose command:");

            String command = scanner.nextLine();
            try {
                mainMenu.execute(command);
            } catch (Exception e) {
                e.printStackTrace();
            }
            access = Access.accessForUse;
        }
    }
}

