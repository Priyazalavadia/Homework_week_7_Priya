package homework7;

public class Q18SumOfArray {
    public static void main(String[] args) {

        int array[] = {5, 10, 15, 20, 25}; //declare array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {   //add array elements
            sum += array[i];
        }
        //display the result
        System.out.println("sum of array elements = " + sum);
    }
}
