public class MallardDuck extends Duck { 
    public MallardDuck (String name) {
        super(name, "Mallard");
    }

    // Override the getBehavior method here
    public String getBehavior() {
        return "flies";
    }
}