import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Your first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Your second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Please choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0.0;

        switch(operation) {
            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(result);
                break;
            case '/':
                if(number2 != 0) {
                result = number1 / number2;
                System.out.println(result);
                }
                else {
                    System.out.println("Error! Division by 0 is not defined!");
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose a valid operation!");
        }

        scanner.close();
    }
}
