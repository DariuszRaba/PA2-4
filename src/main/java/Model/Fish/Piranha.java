package Model.Fish;

public class Piranha extends Fish{
    public Piranha(String name, int mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "plumm arghhh plum";
    }
}
