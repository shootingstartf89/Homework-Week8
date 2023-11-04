//Write a java program to input any number and find out if it’s odd or even.
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner evenodd = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = evenodd.nextInt();

        if(num % 2 == 0)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}
