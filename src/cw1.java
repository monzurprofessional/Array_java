import java.util.Arrays;
import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int N = sc.nextInt();
        int[] array = new int[N + 1];
        for (int i = 0; i < N; i++) {
            System.out.println("enter a number");
            int n = sc.nextInt();
            array[i] = n;
        }
        System.out.println("enter another number");
        int last_num = sc.nextInt();
        array[N] = last_num;


        System.out.println(Arrays.toString(array));
    }

}
