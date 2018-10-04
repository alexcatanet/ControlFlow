package scanner;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        int celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit:");
        fahrenheit = sc.nextInt();

        // fahrenheit (°F) minus 32, times 5/9:
        celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println(fahrenheit + " ºF = " + celsius + " ºC");
    }
}
