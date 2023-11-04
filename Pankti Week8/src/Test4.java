import java.util.Scanner;

//Write if else condition and print your group name in console else others group name.
public class Test4 {
    public static void main(String[] args) {
        Scanner groupname = new Scanner(System.in);

        System.out.print("Enter number of group members: ");
        int num = groupname.nextInt();

        if(num==5)
            System.out.println("The group name is Code2");
        else
            System.out.println("The group name is Code1,Agile or Postman");
    }

}
