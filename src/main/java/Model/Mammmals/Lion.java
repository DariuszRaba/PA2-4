package Model.Mammmals;

public class Lion extends Mammal {
    public Lion(String name, int mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "walk on 4 legs";
    }
}
