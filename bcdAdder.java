// Question: Write a Java program to show BCD Adder
// Name - ADITYA BHARDWAJ
// Section - D2
// Roll No - 07
// Course – B TECH
// Branch – CSE

import java.util.Scanner;

public class bcdAdder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first decimal digit (0-9): ");
        int a = sc.nextInt();

        System.out.print("Enter second decimal digit (0-9): ");
        int b = sc.nextInt();

        if (a > 9 || b > 9 || a < 0 || b < 0) {
            System.out.println("Invalid input! Enter digits between 0 and 9 only.");
            return;
        }

        int sum = a + b;
        int correction = 0;
        int carry = 0;

        // Check if correction is needed
        if (sum > 9) {
            correction = 6;
            sum = sum + correction;
            carry = 1;
        }

        System.out.println("Binary Sum (after BCD correction if needed): " + 
                           String.format("%4s", Integer.toBinaryString(sum)).replace(' ', '0'));

        System.out.println("Carry: " + carry);

        sc.close();
    }
}
