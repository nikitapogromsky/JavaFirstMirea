package ru.mirea.task18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString); // Может выбросить NumberFormatException
            System.out.println("Result of 2 / i: " + (2 / i)); // Может выбросить ArithmeticException
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception2 exception = new Exception2();
        exception.exceptionDemo();
    }
}