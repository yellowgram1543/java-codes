import java.util.Scanner;
public class a4_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For which number do you want the factorial of: ");
        int num = scanner.nextInt();
        factorialnum(num);
        System.out.println("\b= " + factorial(num) );
    }
    public static int factorial(int num){
        int product = 1;
        int i = 1;
        while (i<=num){
            product = product * i;
            i++;
        }
        return product;
    }
    public static void factorialnum(int num){
        int i = 1;
        while(i<=num){
            System.out.print(i + " x" );
            i++;
        }
    }
}
