package homework7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q3StudentMarkSheet {
    public static void main(String[] args) {

            int RollNo;
            int Maths;
            int Science;
            int English;
            int Total = 0;
            boolean Result;
            float Percentage;
            char Grade;

            System.out.println("-----------------------------");
            System.out.println("|                           |");
            System.out.println("|        Mark Sheet         |");
            System.out.println("|___________________________|");
            Scanner Scan = new Scanner(System.in);
            System.out.println("| Name:                     |");
            String name = Scan.nextLine();
            System.out.println("| Roll No:                  |");
            RollNo = Scan.nextInt();
            System.out.println("|___________________________|");
            System.out.println("|Subjects : Mark            |");
            System.out.println("|___________________________|");
            System.out.println("| Maths :                   |");
            Maths = Scan.nextInt();
            System.out.println("| Science :                 |");
            Science = Scan.nextInt();
            System.out.println("| English :                 |");
            English = Scan.nextInt();
            System.out.println("|___________________________|");
            System.out.print("|  Total :                    |");
            Total = Maths + Science + English;
            System.out.println(Total);
            System.out.println("|___________________________|");
            System.out.println("| Percentage :              |");
            Percentage = Total / 3;
            System.out.println(Percentage);
            System.out.println("| Result :                  |");
            if (Percentage < 35) {
                System.out.println("Pass");
            } else if (Percentage > 35) {
                System.out.println("Fail");
            } else {
                System.out.println("Try one more time");
            }
                System.out.println("| Grade :                  |");

                if (Percentage >= 80) {
                    System.out.println("A+");
                } else if (Percentage >= 60) {
                    System.out.println("A");
                } else if (Percentage >= 50) {
                    System.out.println("B");
                } else if (Percentage >= 35) {
                    System.out.println("C");
                } else
                    System.out.println("|______________________|");


            }
        }





