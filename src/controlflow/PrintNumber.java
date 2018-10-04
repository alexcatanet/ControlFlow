package controlflow;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, insert a number: ");
        long number = scanner.nextLong();

        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
