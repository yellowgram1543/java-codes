import java.util.Scanner;
public class palindrone {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int palindrone1 = reverse(num);
        if (palindrone1 == num){
            System.out.println("It is a palindrone");
        }
        else{
            System.out.println("It is not a palindrone");
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
