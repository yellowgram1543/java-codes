import java.util.Scanner;
public class a8_fibonnaciSeries {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
       int number = scanner.nextInt();
       fibonacci(number);
    }
    public static void fibonacci(int num){
        int num1 = 0, num2 = 1, count = 0;
        if (num<=0){
            System.out.println("Number of terms should be greater than zero.");
        }
        else if(num == 1){
            System.out.println("Fibonacci series: " + num1);
        }
        else {
            System.out.print("Fibonacci Series: " +  num1 + " " + num2 );
            count =2;
            while (count < num ){
                int nextTerm = num1 + num2;
                System.out.print(" " + nextTerm);
                num1 = num2;
                num2 = nextTerm;
                count++;
            }
        }
    }
}

