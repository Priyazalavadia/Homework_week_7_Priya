package homework7;

import java.util.Scanner;

public class Q7SalesCommission {
    public static void main(String[] args) {
        double commission;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter sales ID:");

        int salesId = s.nextInt();
        System.out.print("Enter seller's name:");

        String sellerName = s.next();
        System.out.print("Enter sales amount: ");

        double salesAmount = s.nextDouble();
        System.out.print("Enter basic salary: ");
        int basicSalary = s.nextInt();

        if (salesAmount >= 50000) {
             System.out.println("Commission is  " + salesAmount * 35 / 100);

        } else if (salesAmount >= 30000) {
            System.out.println("Commission is   " + salesAmount * 20 / 100);

        } else if (salesAmount >= 20000) {
            System.out.println("Commission is   " + salesAmount * 10 / 100);

        } else if (salesAmount >= 10000) {
             System.out.println("Commission is   " + salesAmount * 5 / 100);
        } else {
            commission = salesAmount * 2 / 100;
            System.out.println("Commission is   " + salesAmount * 2 / 100);
        }
    }
}