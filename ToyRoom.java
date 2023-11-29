package ToyRoom;

import java.util.ArrayList;
import java.util.List;

public class ToyRoom {
    public static List<Toy> toys = new ArrayList<>();
    public static List<Toy> toysSortedGroup = new ArrayList<>();

    public static List<Toy> buyToys = new ArrayList<>();
    public static List<Toy> toysAge3 = new ArrayList<>();
    public static List<Toy> toysAge6 = new ArrayList<>();
    public static List<Toy> toysAge10 = new ArrayList<>();
    public static List<Toy> toysAge14 = new ArrayList<>();

    public static void sortAgeGroup(Toy toy) {
        toys.add(toy);
        if (toy.getAgeForGroup() == 3)
            toysAge3.add(toy);
        else if (toy.getAgeForGroup() == 6) {
            toysAge6.add(toy);
        } else if (toy.getAgeForGroup() == 10)
            toysAge10.add(toy);
        else if (toy.getAgeForGroup() == 14) {
            toysAge14.add(toy);
        }
    }
}
