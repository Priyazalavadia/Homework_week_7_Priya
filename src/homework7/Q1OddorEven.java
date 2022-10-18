package homework7;

import java.util.Scanner;

public class Q1OddorEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Enter The Number:"); //15
        int num = scan.nextInt();
        scan.close();
        //ternary operator
        //15%2 ==> 1==0
        String result = num%2==0 ? "Even number" : "Odd number";
                        System.out.println(result); //odd number

    }
}
