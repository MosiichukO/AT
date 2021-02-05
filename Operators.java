public class Operators {
    public static int task1 (int a, int b) {
        int result = 0;
        if (a % 2 == 0) {
            result = a * b;
        } else {
            result = a + b;
        }
        return result;
    }

    public static void task2 (int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("I четверть");
        } else if (x < 0 && y > 0) {
            System.out.println("II четверть");
        } else if (x < 0 && y < 0) {
            System.out.println("III четверть");
        } else if (x > 0 && y < 0) {
            System.out.println("IV четверть");
        } else if (x == 0 && y == 0) {
            System.out.println("Начало координат");
        } else {
            System.out.println("На оси");
        }
    }

    public static int task3 (int x, int y, int z) {
        int result = 0;
        if (x > 0) {
            result = result + x;
        }
        if (y > 0) {
            result = result + y;
        }
        if (z > 0) {
            result = result + z;
        }
        return result;
    }

    public static int task4 (int x, int y, int z) {
        int sum = x + y + z;
        int multi = x * y * z;
        int result = 0;
        if (sum > multi) {
            result = sum + 3;
        } else {
            result = multi + 3;
        }
        return result;
    }

    public static void task5 (int a) {
        if (0 <= a & a <= 19) {
            System.out.println("Оценка: " + "F");
        } else if (20 <= a & a <= 39) {
            System.out.println("Оценка: " + "E");
        } else if (40 <= a & a <= 59) {
            System.out.println("Оценка: " + "D");
        } else if (60 <= a & a <= 74) {
            System.out.println("Оценка: " + "C");
        } else if (75 <= a & a <= 89) {
            System.out.println("Оценка: " + "B");
        } else if (90 <= a & a <= 100) {
            System.out.println("Оценка: " + "A");
        }
    }
}
