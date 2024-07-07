import java.util.Scanner;
public class a5_sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        System.out.println("The sum of the digits of " + num + " is " + " = " + sumofdigit(num));
    }
    public static int sumofdigit(int number){
        int sum =0;
        while (number > 0 ){
            int lastdigit = number%10;
            sum+=lastdigit;
            number = number/10;
        }
        return sum;
    }
}
