/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
import java.util.Random;
public class HolidayArt {

    public static void main(String[] args) {
        int height = 5;
        if (args.length > 0) {
            try {
                height = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid height argument. Using default height of 5.");
            }
        }
        printTree(height);

        System.out.println("\nHappy Holidays!");
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        int spaces = height;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                Random random = new Random();
                int randNum = random.nextInt(100);
                if (randNum % 6 == 0) {
                    System.out.print("o");
                } else if (randNum % 10 == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < spaces - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|||");
    }
}
