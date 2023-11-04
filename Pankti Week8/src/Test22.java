//Write a Java program to calculate the average value of array elements
public class Test22 {
    public static void main(String[] args) {

        int[] numbers = new int[]{500, 400, 250, 0, -100,-200, -450};


        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }


        double average = sum / numbers.length;


        System.out.println("Average value of the array element is " + average);
    }
}