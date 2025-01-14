import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calendar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to the calender. Please choose an option:");
            System.out.println("1. Show current date");
            System.out.println("2. Calculate date in the future");
            System.out.println("3. Calculate date in the past");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            LocalDate currentDate = LocalDate.now();

            switch(choice) {
                case 1:
                    System.out.println("Today's date: " + currentDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
                    break;
                case 2:
                    System.out.println("Days in advance: ");
                    int daysInAdvance = scanner.nextInt();
                    LocalDate futureDate = currentDate.plusDays(daysInAdvance);
                    System.out.println("Date in " + daysInAdvance + " days: " + futureDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
                    break;
                case 3:
                    System.out.println("Days to go back: ");
                    int daysBackwards = scanner.nextInt();
                    LocalDate pastDate = currentDate.minusDays(daysBackwards);
                    System.out.println("Date " + daysBackwards + " days ago: " + pastDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
                    break;
                case 4:
                    System.out.println("See you next time!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option!"); 
            }
        }
    }
}
