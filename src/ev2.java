import java.util.Scanner;

public class ev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int [] array = new int[N];
        System.out.println("enter the elements of array");
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            array[i]=n;
        }
        System.out.print("enter target value");
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            if(array[i]==target){
                System.out.println(target + " is at index " + i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("element not found");
        }
    }
}
