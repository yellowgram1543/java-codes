import java.util.Arrays;
import java.util.Scanner;

public class a15_reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size ; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));
        reverse(array);
    }
    public static void reverse(int[]array){
        int left = 0;
        int right = array.length - 1;
        while (left < right ){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
