/*
Take an integer N input from the user and create an array of length N by taking the elements as
user input. Then, print the array. Next, sort the array in descending order using Selection Sort
 technique. Lastly, print the sorted array.
 */
import java.util.Scanner;
public class hw5{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("N = ");
        int N=sc.nextInt();
        int [] array = new int[N];

        for(int i=0; i<N; i++){
            System.out.print("Enter a number: ");
            array[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("original array:");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(" ");
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            int min_index =i;
            for (int j = i+1; j < array.length ; j++) {
                if(array[min_index]<array[j]){
                    min_index=j;
                }
            }
            int temp = array[min_index];
            array[min_index]=array[i];
            array[i]=temp;
        }

        System.out.println();
        System.out.println("sorted array:");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(" ");
            }
        }
    }
}
