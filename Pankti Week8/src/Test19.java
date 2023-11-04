//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”
import java.util.Scanner;

public class Test19 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scr.nextInt();

        if (num > 0) {
            System.out.println("Entered number is Positive");
        } else if (num<0) {
            System.out.println("Entered number is ");
        } else {
            System.out.println("Entered number is Zero");
        }

    }

}










