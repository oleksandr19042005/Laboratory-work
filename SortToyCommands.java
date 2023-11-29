package CommandForUser;

import MainMenu.Command;
import ToyRoom.Toy;
import Comparator.*;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static ToyRoom.ToyRoom.buyToys;

public class SortToyCommands implements Command {

    public void execute(List<Toy> list) {
        if (buyToys.isEmpty()) {
            System.out.println("You didn't choose any toys");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the comparator for sorted:\n" +
                    "1)Name\n" +
                    "2)Size\n" +
                    "3)Group\n");

            int choice = scanner.nextInt();

            Comparator<Toy> comparator = null;

            switch (choice) {
                case 1:
                    comparator = new NameComparator();
                    break;
                case 2:
                    comparator = new SizeComparator();
                    break;
                case 3:
                    comparator = new GroupComparator();
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            buyToys.sort(comparator);

            System.out.println("The toys are sorted");
        }
    }
}
