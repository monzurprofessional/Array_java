import java.util.Arrays;

public class cw2 {
    public static void main(String[] args) {
        int [] arr = {9,-5,7,9,-5,5,7};
        System.out.println("before removing duplicates");
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        System.out.println("after replacig duplicates with 0");
        System.out.println(Arrays.toString(arr));

    }
}