package Comparator;

import ToyRoom.Toy;

import java.util.Comparator;

public class NameComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy toy1, Toy toy2) {
        return toy1.getName().compareTo(toy2.getName());
    }
}
