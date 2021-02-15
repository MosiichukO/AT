package Arrays;

import Arrays.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    @Test
    public void test_task1_ArraysMinElement() {
        int actual = Arrays.task1();
        int expected = -456;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_ArraysMaxElement() {
        int actual = Arrays.task2();
        int expected = 1024;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_ArraysIndexOfMinElement() {
        int actual = Arrays.task3();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_ArraysIndexOfMaxElement() {
        int actual = Arrays.task4();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_SumOfElementsNotEvenIndex() {
        int actual = Arrays.task5();
        int expected = 1572;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_ReverseArray() {
        int[] actual = Arrays.task6();
        int[] expected = new int[]{1024, -456, 546, 285, 5, -10, -5, 3, 2, 1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task7_AmountOfNotEvenElements() {
        int actual = Arrays.task7();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task8_HalfReverseArray() {
        int[] actual = Arrays.task8();
        int[] expected = new int[]{5, 285, 546, -456, 1024, 1, 2, 3, -5, -10};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task9_BubbleSorting() {
        int[] actual = Arrays.task9_Bubble();
        int[] expected = new int[]{-456, -10, -5, 1, 2, 3, 5, 285, 546, 1024};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task9_SelectSorting() {
        int[] actual = Arrays.task9_Select();
        int[] expected = new int[]{-456, -10, -5, 1, 2, 3, 5, 285, 546, 1024};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_task9_InsertSorting() {
        int[] actual = Arrays.task9_Insert();
        int[] expected = new int[]{-456, -10, -5, 1, 2, 3, 5, 285, 546, 1024};
        Assertions.assertArrayEquals(expected, actual);
    }
}
