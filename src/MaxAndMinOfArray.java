import java.util.Scanner;
public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();
        int[]array = new int[size];

        System.out.println("Enter " + size + " elements");
        for (int i=0; i< array.length;i++){
            array[i] = sc.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println( );
        System.out.println("The smallest number in the array is: " + min(array));
        System.out.println("The largest number in the array is: " + max(array));

    }
    public static int min(int[] array){
        int min = array[0];
        for (int element:array){
            if(element < min){
                min = element;
            }
        }
        return min;
    }
    public static int max(int[] array){
        int max = array[0];
        for (int element:array){
            if (element>max){
                max = element;
            }
        }
        return max;
    }
}

