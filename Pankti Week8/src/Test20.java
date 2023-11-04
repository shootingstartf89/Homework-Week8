//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;


public class Test20 {
    public static void main(String[] args) {

        int[] num_array = {59, 456, 18, 1076, 2013, 2136, 2308, 1254, 1472, 25, 1456, 2165, 1457, 2006};

        String[] String_array = {"Pankti", "Zarna", "Sonal", "Ayan", "Miten"};


        System.out.println("Original numeric array : " + Arrays.toString(num_array));

        Arrays.sort(num_array);

        System.out.println("Sorted numeric array : " + Arrays.toString(num_array));

        System.out.println("Original string array : " + Arrays.toString(String_array));


        Arrays.sort(String_array);


        System.out.println("Sorted string array : " + Arrays.toString(String_array));
    }
}