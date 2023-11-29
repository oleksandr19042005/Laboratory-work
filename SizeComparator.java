package Comparator;

import ToyRoom.Toy;
import java.util.Comparator;

public class SizeComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy toy1, Toy toy2) {
        int sizeValue1 = toy1.getSize().getValue();
        int sizeValue2 = toy2.getSize().getValue();

        return Integer.compare(sizeValue1, sizeValue2);
    }
}
