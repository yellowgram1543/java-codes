import java.util.Scanner;
public class numberOfOccurance_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        if (size<=0){
            System.out.println("Invalid size.");//user input for size of array
            return;
        }
        int[]array = new int[size];
        System.out.println("Enter " + size + " elements");
        for (int i=0; i< array.length; i++){
            array[i] = sc.nextInt();//user input for elements in the array
            System.out.print(array[i] + " ");
        }
        System.out.println( );
        System.out.println("Enter the number you want to find in the array: ");
        int input = sc.nextInt();//user input for the number he wants to find
        int count = countOccurances(array,input);

        System.out.println("The number of times "+ input + " occurs in the array is: " + count);
    }
    public  static  int countOccurances(int[]array, int number){//method to find the number of occurances
        int count = 0;//initializing
        for(int element:array){//using for-each loop to traverse through the loop
            if (element==number){
                count++;//updating count after find the number
            }
        }
        return count;//returning after the number of occurrences has been found
    }
}
