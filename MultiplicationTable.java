import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        
        // Print the multiplication table for the entered number
        System.out.println("Multiplication table for " + number + ":");
        
        // Loop from 1 to 10 to print the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
