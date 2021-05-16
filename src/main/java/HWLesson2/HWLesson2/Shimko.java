package HWLesson2.HWLesson2;

public class Shimko {
    public static void main(String[] args) {
        System.out.println(checkMySum());
        checkInteger();
        System.out.println(numberPositiveOrNegative());
        printString();
        System.out.println(checkLeapYear());
    }

    public static boolean checkMySum() {
        int a = 11;
        int b = 6;

        if (a + b >= 10 || a + b <= 20) return true;
        else {
            return false;
        }
    }

    public static void checkInteger() {
        int x = 114;

        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean numberPositiveOrNegative() {
        long x = -3456;
        if (x >= 0) return false;
        else {
            return true;
        }

    }

    public static void printString() {
        String w = "Hello World!";
        int t = 8;
        for (int i = 0; i < t; i++) {
            System.out.println(w);
        }
    }

    public static boolean checkLeapYear() {
        long g = 700;

        if (g % 400 == 0) return true;
        else if (g % 4 == 0 && g % 100 !=0) {
            return true;
        } else {
            return false;
        }

    }
}
