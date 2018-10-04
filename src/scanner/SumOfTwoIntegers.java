package scanner;

import java.util.Scanner;

public class SumOfTwoIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value for the first integer:");
        int firstInteger = sc.nextInt();
        System.out.println("Ok, good, now enter please the value for the second integer:");
        int secondInteger = sc.nextInt();

        System.out.println("Sum of the two integers are: " + String.valueOf(firstInteger + secondInteger));
        System.out.println("Difference of the two integers are: " + String.valueOf(firstInteger - secondInteger));

        System.out.println("Product of the two integers are: " + String.valueOf(firstInteger * secondInteger));
        System.out.println("Average ot the two products are: " + (double) (firstInteger + secondInteger) / 2);

        System.out.println("The reminder of the two integers are: " + firstInteger % secondInteger);
    }
}
