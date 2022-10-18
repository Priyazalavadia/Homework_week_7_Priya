package homework7;

import java.util.Scanner;

public class Q10TwoNumberSymbol {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = Scan.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = Scan.nextInt();
        System.out.println("Enter your symbol:");
        char ch = Scan.next().charAt(0);
        if (ch == '+') {
            int sum = num1 + num2;
            System.out.println("Addition of two numbers: " + sum);
        } else if (ch == '-') {
            int sub = num1 - num2;
            System.out.println("Difference of two numbers:" + sub);
        } else if (ch == '*') {
            int mul = num1 * num2;
            System.out.println("Multiplication of two number:" + mul);
        } else if (ch == '/') {
            int div = num1 / num2;
            System.out.println("Division of two number:" + div);

        }

    }

}


