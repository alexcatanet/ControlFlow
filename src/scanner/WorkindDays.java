package scanner;

import java.util.Scanner;

public class WorkindDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, provide a day of the week:");
        String workingDays = scanner.next();

        switch (workingDays.toLowerCase()) {
            case "monday":
                System.out.println("MON");
                break;
            case "tuesday":
                System.out.println("MON");
                break;
            case "wednesday":
                System.out.println("WED, MON");
                break;
            case "thursday":
                System.out.println("WED, MON");
                break;
            case "friday":
                System.out.println("MON, WED, FRI");
            case "saturday":
            case "sunday":
                System.out.println("It's week-end!");
                break;
            default:
                System.out.println("You have inserted an invalid input, try again!");
        }
    }
}
