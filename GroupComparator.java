package Comparator;

import ToyRoom.Toy;

import java.util.Comparator;

public class GroupComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy toy1, Toy toy2) {
        if (toy1.getAgeForGroup() < toy2.getAgeForGroup()) {
            return -1;
        } else if (toy1.getAgeForGroup() > toy2.getAgeForGroup()) {
            return 1;
        } else {
            return 0;
        }
    }
}
