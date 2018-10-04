package controlflow;

import java.util.Scanner;

public class quadraticEquations {

        /*
        Compute the roots of the quadratic equation  using the quadratic formula.
        f(x) = ax^2 + bx + c
         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        // display an intro message
        System.out.println("The quadratic formula finds the roots(s)\n" + "where f(x) = 0 for the function f(x) = " +
                " ax^2 + bx + c\n");

        //get the coefficients from the user
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();

        scanner.close();

        // compute the discriminant, b^2 - 4ac
        double discrim;
        discrim = b * b - 4 * a * c;

        double root1, root2;
        double imag;

        // modify the output depending on sign of the discriminant
        if (discrim > 0) { // two real roots
            root1 = (-b + Math.sqrt(discrim)) / (2 * a);
            root2 = (-b - Math.sqrt(discrim)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        } else if (discrim < 0) { //two imaginary roots
            imag = Math.sqrt(-discrim) / (2 * a);
            System.out.println("Two imaginary roots: " + (-b / (2 * a)) + " +/- " + imag);
        } else {
            root1 = -b / (2 * a);
            System.out.println("One real root: " + root1);
        }
    }
}



