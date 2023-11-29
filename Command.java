package MainMenu;

import ToyRoom.Toy;

import java.util.List;

public interface Command {
    void execute(List<Toy> toys);
}