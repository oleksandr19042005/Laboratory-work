package CommandForUser;

import MainMenu.Command;
import ToyRoom.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ToyRoom.ToyRoom.buyToys;

public class RemoveBuyToy implements Command {

    public void execute(List<Toy> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the parameter for search:");
        String parameter = scanner.nextLine();

        List<Toy> matchedToys = new ArrayList<>();



        for (Toy toy : buyToys) {
            if (toy.getName().equalsIgnoreCase(parameter)) {
                matchedToys.add(toy);
                System.out.println(matchedToys.size() + ". " + toy);
            }
        }

        if (matchedToys.isEmpty()) {
            System.out.println("No toys found with the specified parameter.");
            return;
        }

        System.out.println("Enter the number of the toy to remove:");
        int toyNumberToRemove = scanner.nextInt();

        if (toyNumberToRemove > 0 && toyNumberToRemove <= matchedToys.size()) {

            Toy toyToRemove = matchedToys.get(toyNumberToRemove - 1);
            buyToys.remove(toyToRemove);
            System.out.println("Toy removed: " + toyToRemove);
        } else {
            System.out.println("Invalid toy number entered. No toy removed.");
        }
    }

}
