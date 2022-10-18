package homework7;

import java.util.Scanner;

public class Q6OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num; //Declare a Variable
        System.out.println("Enter a number:");
        num = in.nextInt();
        if (num %2 ==0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is Odd");

    }
}
