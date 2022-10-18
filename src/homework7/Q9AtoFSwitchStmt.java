package homework7;

import java.util.Scanner;

public class Q9AtoFSwitchStmt {
    public static void main(String[] args) {

        String city;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter any character from A to F : ");
        city = Scan.nextLine();
        switch (city) {
            case "A":
                System.out.println("Agra");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Calcutta");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }
}



