package Command;

import Enums.Material;
import Enums.Size;
import MainMenu.Command;
import ToyRoom.Toy;
import ToyRoom.ToyRoom;

import java.util.List;
import java.util.Scanner;

public class AddToyCommand implements Command {
    private ToyRoom toyRoom;
    private Toy toy;

    public AddToyCommand(ToyRoom toyRoom, Toy toy) {
        this.toyRoom = toyRoom;
        this.toy = toy;
    }


    public void execute(List<Toy> toys) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the toy's name (or 'exit' to finish): ");
            String toyName = scanner.next();
            if (toyName.equalsIgnoreCase("exit")) {
                break;
            }
            Material material = null;
            while (material == null) {
                System.out.print("Enter the type [PLASTIC, RUBBER, IRON]\n");
                String materialInput = scanner.next().toUpperCase();
                try {
                    material = Material.valueOf(materialInput);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid size entered. Please enter a valid material.");
                }
            }

            System.out.print("Enter the age group [3, 6, 10, 14]: ");
            int ageForGroup = 0;
            do {
                ageForGroup = scanner.nextInt();
            } while (ageForGroup != 3 && ageForGroup != 6 && ageForGroup != 10 && ageForGroup != 14);

            Size size = null;
            while (size == null) {
                System.out.print("Enter the size [SMALL, MEDIUM, LARGE]: ");
                String sizeInput = scanner.next().toUpperCase();
                try {
                    size = Size.valueOf(sizeInput);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid size entered. Please enter a valid size.");
                }
            }
            System.out.print("Enter the toy's price: ");
            double toyPrice = scanner.nextDouble();
            Toy toy = new Toy(toyName, material, ageForGroup, size, (int) toyPrice);
            ToyRoom.sortAgeGroup(toy);
        }
    }
}
