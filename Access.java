package Command;

import MainMenu.Command;
import ToyRoom.Toy;

import java.util.List;
import java.util.Scanner;
public class Access implements Command {
    public Access() {
    }
    public static int accessForUse = 0;

    @Override
    public void execute(List<Toy> toys) {
        Scanner scanner = new Scanner(System.in);
        int password = 1234;
        System.out.println("Are you an admin or a user?\n" +
                "1)Admin\n" +
                "2)User");
        int choice = 0;

        do {
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Input error. Try Again:");
            }
        } while (choice != 1 && choice != 2);

        int passwordInput = 0;
        if (choice == 1) {
            System.out.println("Enter your password:");
            do {
                passwordInput = scanner.nextInt();
                if (passwordInput == password)
                    accessForUse = 1;
                else
                    System.out.println("The password is not correct.");
            } while (passwordInput != password);
        } else if (choice == 2) {
            accessForUse = 2;
        }
    }
}
