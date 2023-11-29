package Comparator;

import ToyRoom.Toy;

public class MaterialComparator {
    public int compare(Toy toy1, Toy toy2) {
        int sizeValue1 = toy1.getMaterial().getValue();
        int sizeValue2 = toy2.getMaterial().getValue();

        return Integer.compare(sizeValue1, sizeValue2);
    }
}
