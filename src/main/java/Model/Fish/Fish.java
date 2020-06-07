package Model.Fish;

import Model.LivingCreature;

public abstract class Fish extends LivingCreature {
    public Fish(String name, int mass) {
        super(name, mass);
    }

    @Override
    public String breath() {
        return "Breath with gill";
    }
}
