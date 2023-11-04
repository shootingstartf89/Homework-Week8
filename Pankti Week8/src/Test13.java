/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)*/

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the first number - ");
          int num1= scr.nextInt();
        System.out.print("Enter the second number - ");
        int num2 = scr.nextInt();


        System.out.print(
                " Enter the type of operator want to perform (+, -, *, /, %) - ");
        char op = scr.next().charAt(0);
        solution(num1, num2, op);
    }
    public static int solution(int a, int b, char op)
    {
        int ans = 0;

        if (op == '+') {
            ans = a + b;

        }
        else if (op == '-') {
            ans = a - b;

        }
        else if (op == '*') {
            ans = a * b;

        }
        else if (op == '%') {
            ans = a % b;

        }
        else if (op == '/') {
            ans = a / b;
        }


        System.out.println("Answer is = " + ans);
        return ans;
    }

}
