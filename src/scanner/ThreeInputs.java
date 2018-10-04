package scanner;

import java.util.Scanner;

public class ThreeInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one of the Math operators (+, -, * or /):");
        char operator = scanner.next().charAt(0);
        System.out.println("Your have inserted the: " + operator + " operator.");

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter please, the first whole number:");
        int number_1 = scanner1.nextInt();
        System.out.println("your first number is: " + number_1);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Thank you, now enter the second whole number:");
        int number_2 = scanner2.nextInt();
        System.out.println("Your second number is: " + number_2);

        switch (operator) {
            case '+':
                System.out.print("The result of the addition is: ");
                System.out.println(number_1 + number_2);
                break;
            case '-':
                System.out.print("The result of the subtraction is: ");
                System.out.println(number_1 - number_2);
                break;
            case '*':
                System.out.print("The result of the multiplication is: ");
                System.out.println(number_1 * number_2);
                break;
            case '/':
                System.out.print("The result of the division is: ");
                System.out.println(number_1 / number_2);
                break;
            default:
                System.out.println("You have entered an invalid operator, please try again!");
        }
    }
}
