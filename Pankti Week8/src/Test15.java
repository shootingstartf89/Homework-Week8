//Write a program that tells us input value is number or an alphabet or symbol

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter any character :");
        char ch = scr.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("Entered input is Alphabet");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println("Entered input is Number");

        } else {

            System.out.println("Entered input is Special character");
        }

    }
}
