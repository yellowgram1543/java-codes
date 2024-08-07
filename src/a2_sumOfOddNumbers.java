import java.util.Scanner;
public class a2_sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last number till where you want the sum: ");
        int num = scanner.nextInt();
        oddnum(num);
        System.out.println("\b" + " = " + oddNumbers(num) );

    }
    public static int oddNumbers(int num){
        int i = 1;
        int sum = 0;
        while(num>=i){
            sum = sum + i;
            i = i + 2;
        }
        return sum;
    }
    public static void oddnum(int num){
        int i = 1;
        while(i<=num){
            System.out.print(i+ " +");
            i+=2;
        }
    }
}
