import java.util.Arrays;
import java.util.Scanner;

public class ev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int N = sc.nextInt();
        int [] array = new int[N];
        System.out.println("enter the elements of array");
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            array[i]=n;
        }
        System.out.println("original arrayy " + Arrays.toString(array) );

        for (int i = 0; i < N; i++) {
            if (array[i]>0){
                array[i]=1;
            }
            if (array[i]<0){
                array[i]=0;
            }
        }
        System.out.println("after modifying " + Arrays.toString(array) );
    }
}
