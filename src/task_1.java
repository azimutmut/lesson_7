import java.util.Scanner;
import java.util.Arrays;

public class task_1 {
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 20) {
            return true;
        } else {
            return false;
        }
    }




    public static void arrayChange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }

    }

    public static void hundredArr() {
        int[] arr = new int[101];
        for (int i = 0; i <= 100; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void multiplyToTwo() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int o : nums) {
            if (o < 6) {
                System.out.print(o * 2 + " ");
            } else {
                System.out.print(o + " ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(within10and20(10, 54)); // true



        int[] binaryArray = {1, 0, 1, 0, 0, 0, 1};
        arrayChange(binaryArray);
        System.out.println();

        hundredArr();

        multiplyToTwo();
    }
}