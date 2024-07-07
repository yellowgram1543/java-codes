import java.util.Scanner;
public class a2_multiplicationTable {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number for which you want to generate the multiplication table");
        int number = scanner.nextInt();
        printMultiplication(number);
    }
    public static void printMultiplication(int number){
        int i = 1;
        while(i<=10){
            int result = multiply(number,i);
            System.out.println(number + " x " + i +" = " + result );
            i++;

        }
    }
    public static int multiply(int a, int b){
        return a*b;
    }
}
