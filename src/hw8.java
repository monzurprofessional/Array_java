public class hw8 {

    public static void main(String args[]){

        int [] myArray = new int[10];

        int [] b;

        int index1 = 0, index2 =0;
        //System.out.println("index1: " + index1);
        //System.out.println("index2: " + index2);

        index1 = 0;
      //  System.out.println("index1: " + index1);
        b = myArray;

        while (index1 < 10){

            myArray[index1] = index1 + 4;

            index2 = 1;
           // System.out.println("index2: " + index2);

            while (index2 < index1 ){

                myArray[index1] = b[index1] + myArray[index2] - index1;

                index2 = index2 + 1;
              //  System.out.println("index2: " + index2);

            }

            System.out.println("output: " + myArray[index1]);

            index1 = index1 + 1;
          //  System.out.println("index1: " + index1);

        }

    }

}