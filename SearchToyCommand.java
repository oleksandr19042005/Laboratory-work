package CommandForUser;

import Enums.Size;
import MainMenu.Command;
import ToyRoom.Toy;

import java.util.List;
import java.util.Scanner;

public class SearchToyCommand implements Command {

    private List<Toy> toys;

    public SearchToyCommand(List<Toy> toys) {
        this.toys = toys;
    }

    public void execute(List<Toy> buyToys) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the characteristic by which you want to find a toy");
        System.out.println("1) Name\n" +
                "2) Type\n" +
                "3) Group\n" +
                "4) Size\n" +
                "5) Price\n");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                searchAndPrint(toys, "Name");
                break;
            case 2:
                searchAndPrint(toys, "Type");
                break;
            case 3:
                searchAndPrint(toys, "Group");
                break;
            case 4:
                searchAndPrint(toys, "Size");
                break;
            case 5:
                searchAndPrint(toys, "Price");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private void searchAndPrint(List<Toy> toys, String characteristic) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter toy " + characteristic + ":");
        String searchValue = scanner.nextLine();

        boolean found = false;
        for (Toy toy : toys) {
            String value = getValueByCharacteristic(toy, characteristic);
            if (value != null && value.equalsIgnoreCase(searchValue)) {
                System.out.println("Toy found:");
                System.out.println(toy);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No toys found with the given " + characteristic.toLowerCase() + ".");
        }
    }

    private String getValueByCharacteristic(Toy toy, String characteristic) {
        switch (characteristic) {
            case "Name":
                return toy.getName();
            case "Type":
                return toy.getMaterial().toString();
            case "Group":
                return String.valueOf(toy.getAgeForGroup());
            case "Size":
                return toy.getSize().toString();
            case "Price":
                return String.valueOf(toy.getPrice());
            default:
                return null;
        }
    }

}
