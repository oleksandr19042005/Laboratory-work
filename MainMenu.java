package MainMenu;

import java.util.*;

import static ToyRoom.ToyRoom.toys;
import Command.*;
import CommandForUser.*;
import ToyRoom.*;



public class MainMenu {
    private Map<String, Command> menuItems = new LinkedHashMap<>();
    private ToyRoom toyRoom;
    private Toy toy;

    public MainMenu(ToyRoom toyRoom, Toy toy) {
        this.toyRoom = toyRoom;
        this.toy = toy;
        menuItems.put("Add toy", new AddToyCommand(toyRoom, toy));
        menuItems.put("Remove toy",new RemoveToyCommand());
        menuItems.put("Search toy",new SearchToyCommand(toys));
        menuItems.put("Sort toys",new SortToyCommands());
        menuItems.put("Write all the toys",new PrintToyCommand());
        menuItems.put("Buy toys for room",new BuyToysForRoom());
        menuItems.put("Enter budget",new Budget());
        menuItems.put("Print buy toys",new PrintAllBuyToys());
        menuItems.put("Access",new Access());
        menuItems.put("Remove the toy from the purchase",new RemoveBuyToy());
    }

    public void execute(String command) throws Exception {
        Command selectedCommand = menuItems.get(command);
        if (selectedCommand == null) {
            System.out.println("Invalid command");
            return;
        }
        selectedCommand.execute(toys);
    }

}
