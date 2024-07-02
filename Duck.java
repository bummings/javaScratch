public class Duck {
    private String name;
    private String type;

    public Duck(String type, String name) {
            this.name = name;
            this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // this will be overridden in the derived class(es)
    public String getBehavior() {
        return "";
    }

    @Override
    public String toString() {
        return getName() + " the " + getType() + " duck. ";
    }
}