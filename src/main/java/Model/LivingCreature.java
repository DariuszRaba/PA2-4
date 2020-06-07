package Model;

public abstract class LivingCreature {

    private String name;
    private int mass;

    public LivingCreature(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public abstract String breath();
    public abstract String move();

    public String mortality(){
        return "being living creature Im mortal and Im in trouble";
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }
}
