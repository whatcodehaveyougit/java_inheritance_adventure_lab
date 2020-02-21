package arsenal;

public class Remedy {

    private String name;
    private int potency;

    public Remedy(String name, int potency){
        this.name = name;
        this.potency = potency;
    }

    public String getName() {
        return name;
    }

    public int getPotency() {
        return potency;
    }
}
