public class task_4 {
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; times > i; i++) {
            System.out.println(word);
        }
    }
    public static void main(String[] args) {
        printWordNTimes("Andersen", 2);
    }
}