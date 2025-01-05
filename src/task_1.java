public class task_1 {
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(within10and20(10, 54)); // true
    }
}