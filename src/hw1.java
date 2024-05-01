//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
        Write a Java program that asks the user for the length of an array then creates a
        double datatype array of that length by taking inputs from the user.
        Then do the following:
        a. Show the maximum element and its index from the array.
        b. Show the minimum element and its index from the array.
        c. Show the summation of all the elements from the array.
        d. Show the average of all the elements from the array.
                    *** SAMPLE INPUT:***
                         Enter the length of the array: 5
                         Enter a number: 7.5
                         Enter a number: -31.2
                         Enter a number: 344.0
                         Enter a number: 97.1 Enter a number: 100.4

                       *** SAMPLE OUTPUT:***
                         Maximum element 344.0 found at index 2
                         Minimum element -31.2 found at index 1
                         Summation: 517.8
                         Average: 103.56
 */
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array legth");

        double [] array = new double[sc.nextInt()];
        double sum =0;
        System.out.print("Enter a number: ");
        for (int i = 0; i <array.length ; i++) {
            double a = sc.nextDouble();
            sum+=a;
            array[i]=a;
        }

        double max =array[0];
        int max_index =0;

        double min =array[0];
        int min_index =0;


        for (int i = 1; i <array.length ; i++) {
            if (array[i]<min){
                min=array[i];
                min_index=i;
            }
        }
        for (int i = 1; i <array.length ; i++) {
            if (array[i]>max){
                max=array[i];
                max_index=i;
            }
        }
        System.out.println("Maximum element " + max + "found at index " +  max_index);
        System.out.println("Minimum element " + min + "found at index " +  min_index);
        System.out.println("Summation " + sum);
        System.out.println("Average " + sum/array.length);

    }
}