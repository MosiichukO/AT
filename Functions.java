package Functions;


public class Functions {

    public static int DayNumber(int number) {
        if (number == 1) {
            System.out.println("Понедельник");
            return 1;
        } else if (number == 2) {
            System.out.println("Вторник");
            return 2;
        } else if (number == 3) {
            System.out.println("Среда");
            return 3;
        } else if (number == 4) {
            System.out.println("Четверг");
            return 4;
        } else if (number == 5) {
            System.out.println("Пятница");
            return 5;
        } else if (number == 6) {
            System.out.println("Суббота");
            return 6;
        } else if (number == 7) {
            System.out.println("Восскресенье");
            return 7;
        } else {
            System.out.println("Такого дня недели нет");
        }
        return 8;
    }


    public static double Distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
    }


    public static String StringOfNumber(int number) {
        String[] array = new String[]{"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенацдцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семьнадцать", "восемнадцать", "девятнадцать", "двадцать", "тридцать", "сорок", "пятдесят", "шестдесят", "семьдесят", "восемьдесят", "девяносто", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        if (number <= 20) {
            System.out.println(array[number]);
            return array[number];
        } else if (number > 20 && number < 30 || number > 30 && number < 40 || number > 40 && number < 50 || number > 50 && number < 60 || number > 60 && number < 70 || number > 70 && number < 80 || number > 80 && number < 90 || number > 90 && number < 100) {
            String x = array[20 + (number / 10 - 2)] + " " + array[number % 10];
            System.out.println(x);
            return x;
        } else if (number == 30 || number == 40 || number == 50 || number == 60 || number == 70 || number == 80 || number == 90 || number == 100) {
            String y = array[20 + (number / 10 - 2)];
            System.out.println(y);
            return y;
        } else if (number == 200 || number == 300 || number == 400 || number == 500 || number == 600 || number == 700 || number == 800 || number == 900) {
            String z = array[30 + (number / 100 - 3)];
            System.out.println(z);
            return z;
        } else {
            String u = array[30 + (number / 100 - 3)] + " " + array[20 + ((number % 100) / 10) - 2] + " " + array[number % 10];
            System.out.println(u);
            return u;
        }
    }


    public static int getNumberFromString(String number) {
        int x = 0;
        String[] array = new String[]{"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенацдцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семьнадцать", "восемнадцать", "девятнадцать", "двадцать", "тридцать", "сорок", "пятдесят", "шестдесят", "семьдесят", "восемьдесят", "девяносто", "а", "а", "а", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] a = number.split(" ");
        if (a.length == 1) {
            for (int i = 0; i <= 20; i++) {
                if (number.equals(array[i])) {
                    System.out.println(array[i]);
                    x = i;
                }
            }
        } else if (a.length == 2) {
            for (int j = 0; j < 28; j++) {
                if (a[0].equals(array[j])) {
                    System.out.print(array[j] + " ");
                    x = (j % 10) * 10 + 20;
                }
            }
            for (int v = 0; v < 28; v++) {
                if (a[1].equals(array[v])) {
                    System.out.print(array[v]);
                    x = x + v;
                }
            }
        } else if (a.length == 3) {
            for (int k = 0; k < 40; k++) {
                if (a[0].equals(array[k])) {
                    System.out.print(array[k] + " ");
                    x = (k % 10) * 100;
                }
            }
            for (int l = 0; l < 40; l++) {
                if (a[1].equals(array[l])) {
                    System.out.print(array[l] + " ");
                    x = x + ((l % 10) * 10 + 20);
                }
            }
            for (int f = 0; f < 40; f++) {
                if (a[2].equals(array[f])) {
                    System.out.print(array[f]);
                    x = x + f;
                }
            }
        }
        return x;
    }
}

