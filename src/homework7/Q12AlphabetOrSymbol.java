package homework7;

import java.util.Scanner;

public class Q12AlphabetOrSymbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Alphabet/symbol : ");
        char ch = scan.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'Z')) {
            System.out.println(ch + "is an alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + "is a Symbol");

        } else {
            System.out.println(ch + " is a special character");

        }
    }
}
