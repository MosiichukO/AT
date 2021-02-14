package Cycles;

public class Cycles {
    public static int task1_SumForTest() {
        int count = 0;
        int sum = 0;
        boolean a = true;
        for (int i = 1; i <= 99; i = i + 1) {
            if (i % 2 == 0) {
                count = count + 1;
                sum = sum + i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        return sum;
    }

    public static int task1_CountForTest() {
        int count = 0;
        int sum = 0;
        boolean a = true;
        for (int i = 1; i <= 99; i = i + 1) {
            if (i % 2 == 0) {
                count = count + 1;
                sum = sum + i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        return count;
    }

    public static int task2(int number) {
        int a = 2;
        int result = 0;
        while (a <= number / 2) {
            if (number % a == 0) {
                result = 1;
            }
            a++;
        }
        if (number == 0) {
            System.out.println("Число " + number + " не простое.");
            return 2;
        } else if (number < 0) {
            throw new IllegalArgumentException("Простые числа больше 0");
        } else if (result == 1) {
            System.out.println("Число " + number + " не простое.");
            return 0;
        } else {
            System.out.println("Число " + number + " простое. ");
        }
        return 1;
    }

    public static int task3_StepByStepMethod(int x) {
        int result = 1;
        if (x < 0) {
            throw new IllegalArgumentException("Корень вычитается только с положительных чисел");
        } else {
            while (true) {
                if (Math.pow(result, 2) > x) {
                    result = result - 1;
                    break;
                }
                result = result + 1;
            }
            return result;
        }
    }

    public static int task3_BinaryMethod(int x) {
        int min = 0;
        int max = x + 1;
        int mid;
        if (x < 0) {
            throw new IllegalArgumentException("Корень вычитается только с положительных чисел");
        } else {
            while ((max - min) > 1) {
                mid = (min + max) / 2;
                if (Math.pow(mid, 2) <= x) {
                    min = mid;
                } else {
                    max = mid;
                }
            }
            return min;
        }
    }

    public static int task4(int x) {
        int result = 1;
        if (x >= 0) {
            for (int i = 1; i <= x; i++) {
                result = result * i;
            }
            return result;
        } else {
            throw new IllegalArgumentException("Факториал применяется только к натуральным числам");
        }
    }

    public static int task5(int number) {
        int result = 0;
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительним");
        } else {
            while (number > 0) {
                result = result + number % 10;
                number = number / 10;
            }
            return result;
        }
    }

    public static int task6(int number) {
        StringBuilder a = new StringBuilder();
        if (number == 0) {
            System.out.println(number);
            a.append(number);
        } else {
            while (number > 0) {
                System.out.print(number % 10);
                a.append(number % 10);
                number = number / 10;
            }
            return Integer.parseInt(a.toString());
        }
        return Integer.parseInt(a.toString());
    }
}
