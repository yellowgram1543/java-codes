import java.util.Scanner;
public class a10_palindrome {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int palindrome = reverse(num);
        if (palindrome == num){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    public static int reverse(int num){
        int reverse = 0;
        while(num > 0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        return reverse;
    }
}
