/*
Write a Java program that asks the user the length of an array then takes that many
integer numbers as elements for the array as input. Then the program asks the user
to enter the target value. The program should add exactly two elements of the
array to find the target value and their corresponding indices. The program should
print the combination of elements that add up to give the target value and its
corresponding index. If the target value does not exist, print “Target value not found”.
[Only consider the first pair if multiple pairs exist.]

                    *** Sample Input - 1 ***
                    Please enter the length of array: 5
                    Please enter the elements of the array: 3
                    8
                    5
                    4
                    1
                    Please enter the target value:
                    9

                     *** Sample Output - 1 ***
                    Elements need to be added: 8 1
                    Index of the elements: 1 and 4
 */
import java.util.Scanner;

import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of array:");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i <n ; i++) {
            array[i]=sc.nextInt();
        }
        // int [] array= {3,8,5,4,1};
        System.out.println("Please enter the target value:");
        int tar = sc.nextInt();
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag) {
                for (int j = i + 1; j < n; j++) {
                    if (j < n) {
                        if (array[i] + array[j] == tar) {
                            System.out.println("elements: " + array[i] + " " + array[j]);
                            System.out.println("index: " + i + " and " + j);
                            flag = false;

                        }
                    }
                }

            }

        }
        if (flag) {
            System.out.println("Target value not found");
        }

    }
}
