package scanner;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number");
        int insertedNumber = scanner.nextInt();
        int lowerNumber;

        for (int i = insertedNumber; i > 0; i--) {
            lowerNumber = i;
            if (lowerNumber % 2 == 0) {
                System.out.println(lowerNumber);
            }
        }
    }
}


