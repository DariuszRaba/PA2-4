package Model.Birds;

import Model.LivingCreature;

public abstract class Bird extends LivingCreature {

    public Bird(String name, int mass) {
        super(name, mass);
    }

    @Override
    public String breath() {
        return "Breath lungs";
    }
}
