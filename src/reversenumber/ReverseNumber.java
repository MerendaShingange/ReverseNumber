/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversenumber;
import java.util.Scanner;

/**
 *
 * @author Lenovo-User
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (2 digits or more): ");
        int num = scanner.nextInt();

        // Check if the number has 2 or more digits
        if (num < 10) {
            System.out.println("Number must have 2 digits or more.");
        } else {
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }

            System.out.println("Reversed number: " + reversed);
        }
    }
}
    
    

