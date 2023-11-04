// Write a java program that tells us that Input number is odd or even using ternary operator(? :)


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner evenodd = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = evenodd.nextInt();

        String result=(num%2==0) ?"Entered number is even":"Entered number is odd";
        System.out.println(result);


    }
}




