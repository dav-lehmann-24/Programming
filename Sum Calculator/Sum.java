import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an upper limit for your summation: ");
        int upper_limit = scanner.nextInt();
        int sum = 0;

        if(upper_limit < 1) {
            System.out.println("Please choose an upper limit greater than 1.");
        }
        else {
        for(int i = 1; i <= upper_limit; i++) {
            sum += i;
        }
        System.out.println("The summation from 1 to " + upper_limit + " is: " + sum);
        }
    }
}