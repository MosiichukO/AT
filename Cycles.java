public class Cycles {
    public static void task1() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 99; i = i + 1) {
            if (i % 2 == 0) {
                count = count + 1;
                sum = sum + i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }

    public static void task2() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }

            if (count == 2) {
                System.out.println("Результат: " + i + " число простое");
            }
            count = 0;
        }
    }

    public static int task3(int x) {
        double result = Math.round(Math.sqrt(x));
        return x;
    }

    public static int task4(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public static int task5(int number) {
        int result = 0;
        while (number > 0) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }

    public static void task6(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number = number / 10;
        }
    }
}
