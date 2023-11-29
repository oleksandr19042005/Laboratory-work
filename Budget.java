package CommandForUser;


import MainMenu.Command;
import ToyRoom.Toy;

import java.util.List;
import java.util.Scanner;

public class Budget implements Command {
    public static double budget;

    public Budget() {

    }

    public void addBudget(double additionalFunds) {
        budget = additionalFunds;
    }


    public void execute(List<Toy> toys) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your budget:");
        do {
            budget = scanner.nextDouble();
            if (budget < 0) {
                System.out.println("The budget cannot be less than 0. Try again:");

            }
        }while (budget < 0);
        addBudget(budget);
        System.out.println("Budget increased to $" + budget);

    }
}
