/*Input any alphabet from "A" to “F” and print their city name accordingly (using Switch case) if any
        other alphabet should be invalid entry. */

import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        System.out.println("Enter character between A to F : ");
        String city = scr.next();

        switch (city) {

            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chandigadh");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Eluru");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
