package Command;

import MainMenu.Command;
import ToyRoom.Toy;

import java.util.List;

public class PrintToyCommand implements Command {

    public PrintToyCommand() {
    }

    public void execute(List<Toy> toys){
        for (Toy toy:toys) {
            System.out.println(toy);
        }
    }
}
