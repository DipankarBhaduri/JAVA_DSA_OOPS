package Array;

import java.time.Year;
import java.util.Scanner;

public class Days_in_a_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days = total_days(month, year);
        System.out.print(days);
    }

    public static int total_days(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||
                month == 12) {
            return 31;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        if (month == 2 && leap_year(year)) {
            return 29;
        }

        return 28;

    }

    public static boolean leap_year(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }
}
