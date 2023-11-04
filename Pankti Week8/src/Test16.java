/*Write a Java program which input any number between 1to7and it prints The Days name
MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
number is out of selection Print message “Week contains 1 to 7 days”*/

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = in.nextInt();
        switch(num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1to7 days");
                break;
        }
    }
}
