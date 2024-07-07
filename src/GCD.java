import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The GCD of the given numbers is: " + gcd(num1,num2));

    }
    public static int gcd(int number1, int number2){
        while(number2 != 0){
            int temp = number2;
            number2 = number1%number2;
            number1 = temp;
        }
        return number1;
    }
}
