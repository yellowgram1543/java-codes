import java.util.Scanner;
public class a7_primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        if(primeChecker(num)){
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
    public static boolean primeChecker(int num){
        if (num<=1){
            return false;
        }
        int i = 2;
        while (i < num){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
