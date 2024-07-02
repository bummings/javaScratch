public class DuckTest {
    public static void main(String[] args) {
        
        // creating instances
        MallardDuck mallard = new MallardDuck("Faux");
        RubberDuck rubber = new RubberDuck("Graf");

        System.out.println("Duck info: ");
        System.out.println(mallard);
        System.out.println(rubber);

        System.out.println(rubber.getBehavior());
        System.out.println(mallard.getBehavior());
        System.out.println("\nThe end");
    }
}