package scanner;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        int celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius");

        celsius = sc.nextInt();

        // celsius (°C) times 9/5 plus 32:
        fahrenheit = 32 + (celsius * 9 / 5);

        System.out.println(celsius +" ºC = " + fahrenheit + " ºF");
    }
}
