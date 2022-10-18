package homework7;

import java.util.Scanner;

public class Q4NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Month:");
        int m1 = Scan.nextInt();
        System.out.println("Enter year:");
        int y = Scan.nextInt();
        isLeapYear(y);
        System.out.println("year:" + isLeapYear(y));
        System.out.println("Days:" + getDaysInMonth(m1,y));

        isLeapYear(-1600);

        isLeapYear(1600);

        isLeapYear(2017);

        isLeapYear(2000);

        getDaysInMonth(1, 2020);

        getDaysInMonth(2, 2020);

        getDaysInMonth(2, 2018);

        getDaysInMonth(-1, 2020);

        getDaysInMonth(1, -2020);

    }


    public static boolean isLeapYear(int year) {

        boolean isLeapYear = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            } else
                isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        //if (year < 1 || year > 9999) {
        // return false;
        //} else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
        // return true;
        // }
        if (isLeapYear == true)
            System.out.println(year + "is a leap year.");
        else
            System.out.println(year + "is not a leap year.");
        return false;
    }




    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;

        }
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year) == true) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = -1;
                break;
        }
        return days;
    }



}
