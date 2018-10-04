package controlflow;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, this is a program that will determine if the triangle is:\n\n a) Equilateral\n" +
                " b) Scalene\n c) Isosceles\n");

        System.out.print("Please enter the value for length_1: ");
        double length_1 = scanner.nextDouble();
        System.out.print("Please enter the value for length_2: ");
        double length_2 = scanner.nextDouble();
        System.out.print("Please enter the value for length_3: ");
        double length_3 = scanner.nextDouble();
        System.out.println();

        // checking the triangles length
        if (length_1 == length_2 && length_2 == length_3) {
            System.out.println("Good work, this is an equilateral triangle");
        } else if (length_1 == length_2 || length_1 == length_3) {
            System.out.println("Good work, this is an isosceles triangle");
        } else {
            System.out.println("Warning, this is an scalene triangle");
        }
    }
}
