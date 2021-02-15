package Arrays;

public class Arrays {
    public static int task1() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int task2() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int task3() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int task4() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int task5() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                x += array[i];
            }
        }
        return x;
    }

    public static int[] task6() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int x;
        int a = array.length;
        for (int i = 0; i < (a / 2); i++) {
            x = array[i];
            array[i] = array[a - 1 - i];
            array[a - 1 - i] = x;
        }
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }

    public static int task7() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                x += 1;
            }
        }
        return x;
    }

    public static int[] task8() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        int x;
        int a = array.length;
        for (int i = 0; i < (a / 2); i++) {
            x = array[i];
            array[i] = array[a / 2 + i];
            array[a / 2 + i] = x;
        }
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }

    public static int[] task9_Bubble() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int x = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = x;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }

    public static int[] task9_Select() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        for (int i = 0; i < array.length; i++) {
            int minElementIndex = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    minElementIndex = j;
                    min = array[j];
                }
            }
            array[minElementIndex] = array[i];
            array[i] = min;
        }
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }

    public static int[] task9_Insert() {
        int[] array = new int[]{1, 2, 3, -5, -10, 5, 285, 546, -456, 1024};
        for (int i = 1; i < array.length; i++) {
            int usedNow = array[i];
            int j = i - 1;
            while (j >= 0 && usedNow < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = usedNow;
        }
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }
}

