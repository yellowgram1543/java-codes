import java.util.Scanner;
public class a5_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The LCM of the two numbers is: " + factor(num1, num2));
    }
    public static int factor(int number1, int number2){
        int i = 1;
        while (true){
            int factor1 = number1 * i;
            if (factor1%number2==0){
                return factor1;
            }
            i++;
        }
    }
}
