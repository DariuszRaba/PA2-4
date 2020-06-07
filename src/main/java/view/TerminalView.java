package view;

import Model.LivingCreature;

import java.util.List;

public class TerminalView {

    public void printAllCreatures(List<LivingCreature> all){
        for (LivingCreature creature: all
             ) {
            System.out.println("My name is " + creature.getName() + " and I weight "+ creature.getMass()
                    + " and I "+ creature.breath() +
                    " and I " + creature.move() + " and whats more " + creature.mortality());
        }

    }
}
