import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("This program will add two numbers together.");
        System.out.println("Please pick two number from 1 to 10.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = getValidInput(scanner);

        System.out.print("Enter the second number: ");
        int b = getValidInput(scanner);

        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    private static int getValidInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("That's not a valid integer. Please enter a number between 1 and 10: ");
            scanner.nextLine();
        }
        int number = scanner.nextInt();
        while (number < 1 || number > 10) {
            System.out.print("Please enter a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }
}