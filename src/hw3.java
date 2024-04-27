/*
Write a Java program that will take input of two arrays and elements from the user and check
whether the second array is a subset of the first array. A subset is a set that contains only
elements found in the original set.
 */
import java.util.*;
public class hw3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1:");

        int array1_length1 = sc.nextInt();
        int [] array1 = new int[array1_length1];


        System.out.println("Please enter the elements of the arr1:");
        for (int i = 0; i <array1_length1 ; i++) {
            array1[i]=sc.nextInt();
        }

        System.out.print("Please enter the length of array 2:");
        int array2_length1 = sc.nextInt();
        int [] array2 = new int[array2_length1];

        System.out.println("Please enter the elements of the arr2:");
        for (int i = 0; i < array2_length1; i++) {
            array2[i]= sc.nextInt();
        }
        int count =0;

        for (int i = 0; i <array2.length ; i++) { //5 3 2
            for (int j = 0; j < array1.length; j++) {
                if(array1[j]==array2[i]){
                    count++;
                    break;
                }
            }
        }
        if(count==array2.length){
            System.out.println("Array 2 is a subset of Array 1.");
        }
        else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }

    }
}
