package homework7;

public class Q20Array {
    public static void main(String[] args) {
        int array[] = {1, 3, 5, 7, 9, 11};
        int find = 9;
        for (int number : array) {
            if (number == find) {
                System.out.println("The array contains " + find);
            }

        }

    }
}
