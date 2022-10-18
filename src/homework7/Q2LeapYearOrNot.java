package homework7;

import java.util.Scanner;

public class Q2LeapYearOrNot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = s.nextInt();
        boolean leap = false;

        //the year is divided by 4
        if (year % 4 == 0) {

            leap = true;
        }
        //the year is century
        else if (year % 100 == 0) {
            leap = false;
        } else if (year % 400 == 0) {    //if the year divided by 400 then it's a leap year

            leap = true;   //if the year is not century
        } else {
            leap = false;
        }
             if(leap ==true) {
                 System.out.println("The year " + year + " is a leap year");
             }
             else {
                 System.out.println("The year "+ year + " is not a leap year");


}
    }


            }

