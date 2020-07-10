import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        // Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        // Before the user enters the number, print the message "Enter number:"
        // If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
        // Hint:
        // Use an endless while loop.
        Scanner scanner = new Scanner(System.in);

        // int min = 2147483647;
        // int max = -2147483648;
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle Input
        }

        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}