public class task_5 {
    public static void arrayChange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
    public static void main(String[] args) {
        int[] binaryArray = {1, 0, 1, 0, 0, 0, 1};
        arrayChange(binaryArray);
        System.out.println();
    }
}
