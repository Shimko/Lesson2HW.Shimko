package HWLesson2.HWLesson2;

public class Shimko {
    public static void main(String[] args) {
        System.out.println(checkMySum(11, 8));
        checkInteger(114);
        System.out.println(numberPositiveOrNegative(3746));
        printString("Hello world",5);
        System.out.println(checkLeapYear(900));
    }

    public static boolean checkMySum(int a, int b) {

        if (a + b >= 10 || a + b <= 20) return true;
        else return false;
    }

    public static void checkInteger(int x) {

        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean numberPositiveOrNegative(int x) {

        if (x >= 0) return false;
        else {
            return true;
        }
    }

    public static void printString(String w,int t) {

        for (int i = 0; i < t; i++) {
            System.out.println(w);
        }
    }

    public static boolean checkLeapYear(int g) {

        if (g % 400 == 0) return true;
        else if (g % 4 == 0 && g % 100 !=0) {
            return true;
        } else {
            return false;
        }
    }
}
