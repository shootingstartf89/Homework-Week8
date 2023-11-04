//Write a Java program to reverse a word
import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Input a word: ");


        String originalstring = scr.nextLine();

        originalstring = originalstring.trim();
        String reversedstring = "";


        char[] ch = originalstring.toCharArray();

        // Reverse the word by iterating through the characters
        for (int i = ch.length - 1; i >= 0; i--) {
            reversedstring += ch[i];
        }

        // Print the reversed word
        System.out.println("Reverse word: " + reversedstring.trim());
    }
}


