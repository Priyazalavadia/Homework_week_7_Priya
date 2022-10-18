package homework7;

public class Q11Dividedby3and5Separately {
    public static void main(String[] args) {

        int i;
        System.out.println("\nDivided by number 3:");
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " , ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (i = 1; i < 100; i++) {

            if (i % 5 == 0)
                System.out.print(i + " , ");
        }
        System.out.println("\n\nDivided by 3 & 5 :  ");
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ",");
        }
        System.out.println("\n");

    }
}

