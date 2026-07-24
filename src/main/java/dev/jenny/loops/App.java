package dev.jenny.loops;

/**
 * Application entry point: prints a multiplication table to the console.
 */
public final class App {

    private App() {
    }

    /**
     * Prints the multiplication table of the number passed as argument.
     * If no argument is given, it uses 5 as the example from the exercise.
     *
     * @param args The program arguments; the first one is the number.
     */
    public static void main(String[] args) {
        int number = args.length > 0 ? Integer.parseInt(args[0]) : 5;

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable.multiplyBy(number));
    }
}
