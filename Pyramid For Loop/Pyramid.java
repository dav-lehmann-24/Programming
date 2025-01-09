import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a height for the pyramid, which is greater than 0: ");
        int height = scanner.nextInt();

        // If height <= 0, the output says to choose a height greater than 0
        if (height <= 0) {
            System.out.println("Please choose a height greater than 0.");
        }
        else {
            // Print the pyramid
            for (int i = 1; i <= height; i++) {
                for (int j = 0; j < height - i; j++) {
                    System.out.print(" "); // Gives out the spaces to form the pyramid
                }
                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print("*"); // Print the stars for the pyramid in the current row
                }
                System.out.println();
            }
        }
    }
}