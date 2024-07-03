import java.util.Scanner;
public class deleteAnElementInArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Invalid size.");
            return;
        }

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the number you want to remove:");
        int x = scanner.nextInt();

        int[] newArray = deleteElement(array, x);

        if (newArray.length == array.length) {
            System.out.println("No such element was found.");
        } else {
            System.out.println("New array after removing " + x + ":");
            for (int element : newArray) {
                System.out.print(element + " ");
            }
        }
    }

    public static int[] deleteElement(int[] array, int x) {
        int count = 0;
        for (int element : array) {
            if (element != x) {
                count++;
            }
        }

        if (count == array.length) {
            return array;
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int element : array) {
            if (element != x) {
                newArray[index++] = element;
            }
        }
        return newArray;
    }
}

