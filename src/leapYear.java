public class leapYear {
    public static boolean smth(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(smth(400));
    }
}