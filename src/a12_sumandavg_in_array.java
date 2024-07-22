import java.util.Scanner;
public class a12_sumandavg_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int i = sc.nextInt();

        //input validation for array size
        if (i<=0) {
            System.out.println("Invalid size. Please enter a valid positive integer");
        }
            int[] array = new int[i];

            System.out.println("Enter " + i + " elements");
            for (i=0 ; i < array.length; i++){
                array[i] = sc.nextInt();
                System.out.print(array[i] + " ");
            }
            System.out.println();
            int sum = 0;
            for (int element:array){
                sum+=element;

            }
            // calculate average after summing all elements
            double average = (double)sum/ array.length;
            System.out.println("The sum of all elements in the array is: " + sum);
            System.out.println("The average of all elements in the array is: " + average);

    }

}
