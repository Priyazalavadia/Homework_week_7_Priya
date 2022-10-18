package homework7;

import java.util.Scanner;

public class Q19AverageValueOfArray {
    public static void main(String[] args) {


        int[] numbers = new int[]{20, 40, 60, 80, 100}; //defined an array

        int sum = 0; //sum of array elements
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
            double avg = sum / numbers.length;
            System.out.println("Average value of the array element is : " + avg);


        }

    }
}
