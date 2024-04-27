import java.util.Arrays;

public class hw6 {
    public static void main(String[] args) {
        int [] marks ={85,90,75,44,99};
        String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        for (int i = 0; i < marks.length-1; i++) {
            for (int j = 0; j < marks.length-1-i; j++) {
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    String temp_st = names[j];
                    marks[j]=marks[j+1];
                    names[j]=names[j+1];
                    marks[j+1]=temp;
                    names[j+1]=temp_st;


                }
            }
        }
        System.out.println("Sorted Array");
        for (int i = 0; i < marks.length ; i++) {
            System.out.print(marks[i]);
            if(i!= marks.length){
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < names.length ; i++) {
            System.out.print(names[i]);
            if(i!= marks.length){
                System.out.print(" ");
            }
        }

    }
}
