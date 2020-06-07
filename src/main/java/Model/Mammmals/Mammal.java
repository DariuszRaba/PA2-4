package Model.Mammmals;

import Model.LivingCreature;

public abstract class Mammal extends LivingCreature {


    public Mammal(String name, int mass) {
        super(name, mass);
    }

    @Override
    public String breath() {
        return "Breathe with lungs";
    }
}
