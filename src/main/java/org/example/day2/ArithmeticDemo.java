package org.example.day2;

import java.util.Arrays;

public class ArithmeticDemo {
    public static void main(String[] args){

        // ways to initialise array

        int []arr1 = new int[10];
        int []arr2 = {120,20,35,400,5,35,100,20,30,90,46,37,28,26,59,10};
        arr1 = new int[10];

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        arr2[2] = 100;

        System.out.println("Array2 is : ");

        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i] + " ");
        }

       // Converting array to tostring
        System.out.println("Result of toString converted array : ");
        String result = Arrays.toString(arr2);
        System.out.println(result);

        // Functions with array
        Arrays.sort(arr2); // ---------------------------------sort function
        System.out.println("sorted array is : " + Arrays.toString(arr2));

        System.out.println("Testing original array, after tostring");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n");

        Arrays.sort(arr2, 2,4); //--------------sort in range
        System.out.println("Array after being sorted in range : " + Arrays.toString(arr2));

        int []arr3 = Arrays.copyOf(arr2,arr2.length);


        // copyof, copyOfRange, fill, fill with range


        int []arr4 = Arrays.copyOfRange(arr2,10,15);
        System.out.println(" Testing copyOfRange function : " + Arrays.toString(arr4));

        Arrays.fill(arr2,50); //--------------------------fill function
        System.out.println("Testing fill function : " + Arrays.toString(arr2));

        Arrays.fill(arr2, 3, 12, 0);//--------fill in range function
        System.out.println(" Testing fill in range function : " + Arrays.toString(arr2));

        System.out.println("Checking copyof function" + Arrays.toString(arr3));//----copyof function
    }
}

 /*
 //Using loop prints each array element separately, usually one per line.
// Arrays.toString() - converts the array into a readable string format like [10, 20, 100, 40, 50].
// Benefits: easier debugging, clean logging, less manual formatting, helpful in testing,
// string operations, UI display, and API/file output.

  */
