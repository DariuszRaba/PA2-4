package Model.Mammmals;

public class Human extends Mammal {

    public Human(String name, int mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "walk on 2 legs";
    }
}
