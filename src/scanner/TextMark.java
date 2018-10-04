package scanner;

import java.util.Scanner;

public class TextMark {
    public static void main(String[] args) {

        // creating and initializing a variable of type int, name "mark"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your numerical mark from 0 to 10:");
        int mark = scanner.nextInt();

        switch (mark) {
            case 5:
                System.out.println("Approved.");
                break;
            case 6:
                System.out.println("Good.");
                break;
            case 7:
            case 8:
                System.out.println("Very Good!");
                break;
            case 9:
            case 10:
                System.out.println("I'm proud of you!");
                break;
            default:
                System.out.println("Fail!");
        }

        System.out.println("*********************");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please, insert again your numerical mark from 0 to 10:");
        int mark_2 = scanner1.nextInt();

        if (mark_2 == 5) {
            System.out.println("Approved.");
        } else if (mark_2 == 6) {
            System.out.println("Good.");
        } else if (mark_2 == 7 || mark_2 == 8) {
            System.out.println("Very Good!");
        } else if (mark_2 == 9 || mark_2 == 10) {
            System.out.println("I'm proud of you!");
        } else {
            System.out.println("Fail!");
        }
    }
}
