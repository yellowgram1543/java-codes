import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num = scanner.nextInt();
        int sum = check(num);
        if (sum == num){
            System.out.println("Your number is an armstrong number");
        }
        else{
            System.out.println("Your number is not an armstrong number");
        }
    }
    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
    public static int raisingThePower(int digit, int count){
        return (int) Math.pow(digit, count);
    }
    public static int check(int num){
        int sum = 0;
        int temp = num;
        int count = countDigits(num);
        while(temp > 0){
            int digit = temp%10;
            sum += raisingThePower(digit, count);
            temp =temp/10;
        }
        return sum;
    }
}
