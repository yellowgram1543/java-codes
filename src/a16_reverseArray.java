import java.util.Arrays;
import java.util.Scanner;

public class a16_reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size input: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));
        newArray(array);
    }

    public static void newArray(int[] array){
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[array.length - i - 1];
        }
        System.out.println("Reversed array: " + Arrays.toString(newarray));
    }
}




