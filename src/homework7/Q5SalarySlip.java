package homework7;

import java.util.Scanner;

public class Q5SalarySlip {

    public static void main(String[] args) {


        String empName;
        float Gross_Salary, empID;
        int bs, HRA, TA, DA, PF;

        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("|      Salary Slip        |");
        System.out.println("---------------------------");
        System.out.println("|        Employee id:     |");
        empID = in.nextFloat();
        System.out.println("|        Employee Name:   |");
        empName = in.next();
        System.out.println("|        Basic Salary:    |");
        bs = in.nextInt();
        System.out.println("| HRA 10%                 |");

        HRA = (bs * 10 / 100);
        System.out.println(HRA);
        System.out.println("| TA 8% :                 |");
        TA = (bs * 8 / 100);
        System.out.println(TA);

        System.out.println("| DA 9% :                  |");
        DA = (bs * 9 / 100 );
        System.out.println(DA);

        System.out.println("| PF -20% :                 |");
        PF = (bs * -20 /100);
        System.out.println(PF);
        System.out.println("|___________________________|");
        System.out.println("|Gross Salary:              |");
        Gross_Salary = (bs + HRA + TA + DA - PF);
        System.out.println(Gross_Salary);

        System.out.println("|===========================|");


    }
}


