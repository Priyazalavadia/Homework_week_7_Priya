package homework7;

import java.util.Scanner;
import java.util.SortedMap;

public class Q16PositiveNegative {
    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = Scan.nextInt();

        if (num > 0) {
            System.out.println(num + "is a positive num");
        } else if (num < 0) {
            System.out.println(num + "is a negative num");
        } else {
            System.out.println("The Number is Zero");

        }
    }
}

