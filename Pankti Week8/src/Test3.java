/*Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
public class Test3 {
    public static void main(String[] args) {
        m3();
    }

    public static void m3() {
        String[][] country = {{"India", "England", "Afghanistan", "Newzeland", "Israel"},
                {"New Delhi", "London", "Kabul", "Wellington", "Jerusalem"}};
        System.out.println(country[0][0]  +"'s capital is " + country[1][0]);
        System.out.println(country[0][1]  +"'s capital is " + country[1][1]);
        System.out.println(country[0][2]  +"'s capital is " + country[1][2]);
        System.out.println(country[0][3]  +"'s capital is " + country[1][3]);
        System.out.println(country[0][4]  +"'s capital is " + country[1][4]);

    }
}
