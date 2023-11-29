package CommandForUser;

import MainMenu.Command;
import ToyRoom.Toy;
import ToyRoom.ToyRoom;

import static ToyRoom.ToyRoom.buyToys;
import static ToyRoom.ToyRoom.toysSortedGroup;
import java.util.List;
import java.util.Scanner;

public class BuyToysForRoom implements Command {


    @Override
    public void execute(List<Toy> toys) {
        Scanner scanner = new Scanner(System.in);
        if (toys.isEmpty()) {
            System.out.println("The list of toys is empty. To begin, add toys to the store.");
            return;
        }
        double budget = Budget.budget;
        System.out.println("What age group do you need toys for?\n" +
                "1)3\n" +
                "2)6\n" +
                "3)10\n" +
                "4)14\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                toysSortedGroup = ToyRoom.toysAge3;
                break;
            case 2:
                toysSortedGroup = ToyRoom.toysAge6;
                break;
            case 3:
                toysSortedGroup = ToyRoom.toysAge10;
                break;
            case 4:
                toysSortedGroup = ToyRoom.toysAge14;
                break;
            default:
                System.out.println("");
        }

        System.out.println("Choose a toy to buy:");
        int b = 1;
        for (Toy toy : toysSortedGroup) {
            System.out.println(b + ") " + toy);
            b++;
        }
        System.out.println("To finish, enter 'exit'.");

        while (true) {

            String toyName = scanner.nextLine();
            if (toyName.equals("exit")) {
                break;
            }
            int variable = 0;
            for (Toy toy :toysSortedGroup ) {
                if (toy.getName().equalsIgnoreCase(toyName)) {
                    if (budget >= toy.getPrice()) {
                        budget -= toy.getPrice();
                        buyToys.add(toy);
                        System.out.println("Toy '" + toyName + "' purchased.");
                        System.out.println("Budget balance: $" + budget);
                        variable = 1;
                    } else {
                        System.out.println("Not enough budget remaining to buy '" + toyName + "'.");
                    }

                }

            }
            if (variable == 0) {
                System.out.println("Toy not found");
                variable = 0;
            }
        }
    }
}
