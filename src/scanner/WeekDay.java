package scanner;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide a number, related to the days of the week:");
        int numberOfDays = scanner.nextInt();

        switch (numberOfDays) {
            case 1:
                System.out.println(weekDays[0]);
                break;
            case 2:
                System.out.println(weekDays[1]);
                break;
            case 3:
                System.out.println(weekDays[2]);
                break;
            case 4:
                System.out.println(weekDays[3]);
                break;
            case 5:
                System.out.println(weekDays[4]);
                break;
            case 6:
                System.out.println(weekDays[5]);
            case 7:
                System.out.println(weekDays[6]);
                break;
            default:
                System.out.println("You have entered an invalid number, no such a day of the week, try again!");
        }
    }
}
