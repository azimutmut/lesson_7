public class task_6 {
    public static void hundredArr() {
        int[] arr = new int[101];
        for (int i = 0; i <= 100; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        hundredArr();
    }
}
