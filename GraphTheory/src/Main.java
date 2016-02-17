public class Main {

    public static void main(String[] args) {
        System.out.println("Example 1 : Primms");
        Algorithm.Primms(ExampleGraphs.Example1());

        System.out.println("Example 2 : Primms");
        Algorithm.Primms(ExampleGraphs.Example2());

        System.out.println("Example 1 : Kruskals");
        Algorithm.Kruskals(ExampleGraphs.Example1());

        System.out.println("Example 2 : Kruskals");
        Algorithm.Kruskals(ExampleGraphs.Example2());
    }
}
