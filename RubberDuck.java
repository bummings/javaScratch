public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name, "Rubber");
    }

    // Override the getBehavior method here
    public String getBehavior() {
        return "squeaks";
    }
}