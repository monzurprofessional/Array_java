/*
You are given an integer array. You need to create a new array that will contain
only the unique elements of the given array. Finally, print the new array.
              *** SAMPLE INPUT: int arr [] = {23,100,23,56,100};***
               *** SAMPLE OUTPUT : 23 100 56  ***
*/
import java.util.*;
public class hw2 {
    public static void main(String[] args) {
        int[] array = {23, 100, 23, 56, 100};
        //   int[] array = {11,-5,10,11,-7,-5,-5};
        int extra = 0;
        int[] new_array = new int[array.length];
        int start=0;

        for (int i = 0; i < array.length; i++) {
            boolean unique = true;
            for (int j = 0; j < start; j++) {
                if (array[i] == new_array[j]) {
                    unique = false;
                    extra++;
                    break;
                }

            }
            if (unique) {
                new_array[start] = array[i];
                start++;
            }
        }
        int[] final_array = new int[array.length-extra];
        for (int i = 0; i < final_array.length; i++) {
            final_array[i] = new_array[i];

        }
        System.out.println("Input array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("New array:");
        for (int i = 0; i < final_array.length; i++) {
            System.out.print(final_array[i]);
            System.out.print(" ");
        }
        // System.out.println(Arrays.toString(final_array));

    }
}
