//Write a java program to get numbers from users and print whether it is positive or negative.

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner Polarity = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Polarity.nextInt();

        if(num>0)
            System.out.println("Entered number is Positive");
        else
            System.out.println("Entered number is Negative");




    }
}
