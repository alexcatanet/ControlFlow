package scanner;

import java.util.Scanner;

public class MinutesToNrOfYears {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of minutes:");
        long minutes = sc.nextLong(); // the user can enter more than 2.147.483.647 minutes

        if (minutes < 0) {
            System.out.println("Please enter just positive numbers");
        } else {
            // number of minutes converted to an non leap year
            long year = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long day = remainingMinutes / 1440; // compute the reminder of the days

        /*
        In this case you want to compute just the nr. of the days, you will have to write the follow:
        long year = minutes / 525600;
        long day = minutes/1440;
         */

            System.out.println(minutes + " minutes is approximately " + year + " year(s) and " + day + " days.");
        }
    }
}
