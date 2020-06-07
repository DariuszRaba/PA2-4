import Model.Birds.Raven;
import Model.Fish.Piranha;
import Model.LivingCreature;
import Model.Mammmals.Human;
import Model.Mammmals.Lion;
import view.TerminalView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TerminalView view = new TerminalView();

        List<LivingCreature> listOfAll = new ArrayList<>();
        listOfAll.add(new Human("Krzysiek", 96));
        listOfAll.add(new Lion("Woods", 18));
        listOfAll.add(new Raven("Jon Snow", 2));
        listOfAll.add(new Piranha("Black Raven", 1));

        view.printAllCreatures(listOfAll);


    }
}
