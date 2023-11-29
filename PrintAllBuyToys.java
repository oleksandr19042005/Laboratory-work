package CommandForUser;

import MainMenu.Command;
import ToyRoom.Toy;

import java.util.List;
import static ToyRoom.ToyRoom.buyToys;

public class PrintAllBuyToys implements Command {

    @Override
    public void execute(List<Toy> toys){
        for (Toy toy:buyToys) {
            System.out.println(toy);
        }
    }
}
