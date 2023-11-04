/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/

import java.util.Scanner;

public class Test6 {


    public static void main(String[] args) {
        double HRA,TA, DA,PF,Grosssalary;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter EmployeeID:");
        int id = scr.nextInt();

        System.out.print("Enter Employeename:");
        String name = scr.next();

        System.out.print("Enter salary:");
        double salary=scr.nextDouble();

        HRA= 0.1*salary;
        DA= 0.08*salary;
        TA=0.09*salary;
        PF=0.2*salary;
        Grosssalary=salary+HRA+TA+DA-PF;

        System.out.println("| Salary Slip            |" );
        System.out.println("|                        |" );
        System.out.println("________________________  " );
        System.out.println("| Employee ID  : "+id       );
        System.out.println("| Employee Name:"+name       );
        System.out.println("|________________________  |");
        System.out.println("|Basic Salary  :"+salary     );
        System.out.println("|HRA 10%       :"+HRA        );
        System.out.println("|TA 8%         :"+TA         );
        System.out.println("|DA 9%         :"+DA         );
        System.out.println("|PF-20&        :"+PF         );
        System.out.println("|________________________  |");
        System.out.println("|Gross Salary  :"+Grosssalary);
        System.out.println("|==========================|");


    }
}



