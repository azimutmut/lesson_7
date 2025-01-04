import java.util.Scanner;
import java.util.Arrays;

public class task_1 {
    public static boolean isSumGreaterThan50(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 50) {
            return true;
        } else {
            return false;
        }
    }
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    public static boolean isNegative(int x) {
        if (x >=0) {
            return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; times>i; i++) {
            System.out.println(word);
        }
    }
    public static void arrayChange(int[] arr){
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
//        public static void arrayChange(int[] array) {
//            for (int i = 0; i < array.length; i++) {
//                array[i] = array[i] == 0 ? 1 : 0; // Если элемент 0, становится 1, иначе — 0
//            }
//        }

    }


    public static void main(String[] args) {
        System.out.println(isSumGreaterThan50(10, 5, 4)); // true

        isPositiveOrNegative(-3);

        System.out.println(isNegative(-3));

        printWordNTimes("Andersen", 2);

        int[] binaryArray = {1, 0, 1, 0, 0, 0, 1};
        arrayChange(binaryArray);
        System.out.println();


    }
}