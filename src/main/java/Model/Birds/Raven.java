package Model.Birds;

public class Raven extends Bird {
    public Raven(String name, int mass) {
        super(name, mass);
    }

    @Override
    public String move() {
        return "friu friu";
    }
}
