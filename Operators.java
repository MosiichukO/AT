package Operators;

public class Operators {
    public static double task1(double a, double b) {
        double result = 0;
        if (a % 2 == 0) {
            result = a * b;
        } else {
            result = a + b;
        }
        return result;
    }

    public static int task2(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("I четверть");
            return 0;
        } else if (x < 0 && y > 0) {
            System.out.println("II четверть");
            return 1;
        } else if (x < 0 && y < 0) {
            System.out.println("III четверть");
            return 2;
        } else if (x > 0 && y < 0) {
            System.out.println("IV четверть");
            return 3;
        } else if (x == 0 && y == 0) {
            System.out.println("Начало координат");
            return 4;
        } else if (x > 0 && y == 0) {
            System.out.println("На оси между I и IV четвертью");
            return 5;
        } else if (x == 0 && y > 0) {
            System.out.println("На оси между I и II четвертью");
            return 6;
        } else if (x < 0 && y == 0) {
            System.out.println("На оси между II и III четвертью");
            return 7;
        } else {
            System.out.println("На оси между III и IV четвертью");
        }
        return 8;
    }

    public static int task3(int x, int y, int z) {
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

    public static int task4(int x, int y, int z) {
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

    public static int task5 (int a) {
        if (0 <= a & a <= 19) {
            System.out.println("Оценка: " + "F");
            return 0;
        } else if (20 <= a & a <= 39) {
            System.out.println("Оценка: " + "E");
            return 1;
        } else if (40 <= a & a <= 59) {
            System.out.println("Оценка: " + "D");
            return 2;
        } else if (60 <= a & a <= 74) {
            System.out.println("Оценка: " + "C");
            return 3;
        } else if (75 <= a & a <= 89) {
            System.out.println("Оценка: " + "B");
            return 4;
        } else if (90 <= a & a <= 100) {
            System.out.println("Оценка: " + "A");
            return 5;
        } else {
            throw new IllegalArgumentException("Некорректые данные");
        }
    }
}
