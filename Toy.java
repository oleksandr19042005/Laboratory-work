package ToyRoom;

import Enums.Material;
import Enums.Size;

public class Toy {
    private String name;
    private Material material;
    private int ageForGroup;
    private Size size;
    private int price;

    public Toy(String name, Material material, int ageForGroup, Size size, int price) {
        this.name = name;
        this.material = material;
        this.ageForGroup = ageForGroup;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public int getAgeForGroup() {
        return ageForGroup;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Toy details: \n" +
                "Name: " + this.name + "\n" +
                "Type: " + this.material + "\n" +
                "Age for Group: " + this.ageForGroup + "\n" +
                "Size : " + this.size + "\n" +
                "Price:" + this.price + "\n";
    }
}
