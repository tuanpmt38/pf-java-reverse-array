import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        //input size array
        do {
            System.out.print("Enter size array:");
            size = sc.nextInt();
            if (size > 10)
                System.out.print("Size does not exceed 10");
        } while (size > 10);
        //input element array
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element" + (i) + ":");
            array[i] = sc.nextInt();
        }
        //display array
        System.out.printf("%-20s%s", "Array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //reverse array
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
//        c2
//        for (int i = 0; i < array.length; i++)
//        for (int j = array.length - 1; j > 1; j--) {
//            int temp = array[j];
//            array[j] = array[j - 1];
//            array[j - 1] = temp;
//
//        }
        //array before reverse
        System.out.printf("%-20s%s", "Array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
