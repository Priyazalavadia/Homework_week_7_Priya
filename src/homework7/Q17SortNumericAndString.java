package homework7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q17SortNumericAndString {
    public static void main(String[] args) {
        int[] array = {14, 60, 75, 90, 54};

        String[] array1 = {"java", "scrum", "cucumber", "postman"};

        Arrays.sort(array);
        System.out.println("sort numeric array : " + Arrays.toString(array));

        Arrays.sort(array1);
        System.out.println("Sort numeric array: " + Arrays.toString(array1));


    }
}
