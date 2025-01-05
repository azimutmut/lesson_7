public class task_7 {
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
        multiplyToTwo();

    }
}
