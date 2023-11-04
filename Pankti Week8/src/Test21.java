//Write a Java program to sum values of an array.
public class Test21 {
    public static void main(String[] args) {

        int array[] = {10, 30, 50, 70, 90, 110, 130, 150, 170, 190};


        int sum = 0;


        for (int i : array)

            sum += i;


        System.out.println("The sum is " + sum);
    }
}



