package homework7;

import java.util.Scanner;

public class Q8AlphabetAtoF {
    public static void main(String[] args) {
 
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter Alphabet Starts with 'A' To 'F' :");
                char ch = Scan.next().charAt(0);
                if(ch == 'A'){
                    System.out.println(" Agra ");
                    
                } else if (ch =='B') {
                    System.out.println("Bombay");
                    
                } else if (ch =='C') {
                    System.out.println("Calcutta");
                    
                } else if (ch =='D') {
                    System.out.println("Delhi");
                    
                } else if (ch == 'E') {
                    System.out.println("Edinburgh");
                } else if (ch == 'F') {
                    System.out.println("France");

                }else

                    System.out.println("invalid entry");
                Scan.close();

                }



    }

