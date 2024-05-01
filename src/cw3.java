import java.util.Arrays;

public class cw3 {
    public static void main(String[] args) {
        int [] arr = {7,-31,344,97,100};
       int l = arr.length;

       // reversed using a new array

        int [] rev = new int [l];
        for(int i=0; i<l; i++){
            rev[l-1-i]=arr[i];
        }
        System.out.println("reversed using a new array ");
        System.out.println(Arrays.toString(rev));

        //reversed the original array

        for(int i=0; i<l/2; i++){
            int temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }

        System.out.println("reversed the original array ");
        System.out.println(Arrays.toString(arr));

    }
}
