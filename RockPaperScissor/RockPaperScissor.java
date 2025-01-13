import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Scissor", "Rock", "Paper"};

        System.out.println("Welcome to the game Rock Paper Scissor.");

        boolean active_game = true;
        while(active_game == true) {
            System.out.println("Please choose one of the following items: ");
            System.out.println("0: Scissor \n1: Rock \n2: Paper");

            System.out.println("Your choice: ");
            int userChoice = scanner.nextInt();

            if(userChoice < 0 || userChoice > 2) {
                System.out.println("Your choice is not valid. Please choose 0, 1 or 2!");
            }

            int enemyChoice = random.nextInt(3);

            System.out.println("You chose: " + options[userChoice]);
            System.out.println("Your enemy chose: " + options[enemyChoice]);

            if(userChoice == enemyChoice) {
                System.out.println("It's a tie. Play again!");
            }
            else if((userChoice == 0 && enemyChoice == 2) ||
                    (userChoice == 1 && enemyChoice == 0) ||
                    (userChoice == 2 && enemyChoice == 1)) {
                System.out.println("Congratulations, you won! :)");
                active_game = false;
            }
            else {
                System.out.println("What a shame, you lost! :(");
                active_game = false;
            }
        }

        scanner.close();
    }
}
