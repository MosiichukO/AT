package Operators;

import Operators.Operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class OperatorsTest {
    @Test
    public void test_task1_evenNumber_getSomOrMultiply() {
        double actual = Operators.task1(8, 5);
        double expected = 40;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_oddNumber_getSomOrMultiply() {
        double actual = Operators.task1(5, 5);
        double expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_negativeOneNumber_getSunOrMultiply() {
        double actual = Operators.task1(-6, 5);
        double expected = -30;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_negativeBothNumbers_getSunOrMultiply() {
        double actual = Operators.task1(-6, -20);
        double expected = 120;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_ZeroNumber_getSunOrMultiply() {
        double actual = Operators.task1(0, 5);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_FractionNumber_getSunOrMultiply() {
        double actual = Operators.task1(5.3, 5);
        double expected = 10.3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_PositiveNumbers_WhichQuarter() {
        int actual = Operators.task2(4, 5);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test_task2_NegativeNumbers_WhichQuarter() {
        int actual = Operators.task2(-4, -5);
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test_task2_BothZeroNumbers_WhichQuarter() {
        int actual = Operators.task2(0, 0);
        int expected = 4;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test_task2_ZeroFirstNumber_WhichQuarter() {
        int actual = Operators.task2(0, 5);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_ZeroSecondNumber_WhichQuarter() {
        int actual = Operators.task2(-5, 0);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_OneNegativeNumber_SumOfPositiveNumbers() {
        int actual = Operators.task3(-5, 5, 21);
        int expected = 26;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task3_TwoNegativeNumbers_SumOfPositiveNumbers() {
        int actual = Operators.task3(-5, -15, 21);
        int expected = 21;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task3_ThreeNegativeNumbers_SumOfPositiveNumbers() {
        int actual = Operators.task3(-5, -15, -21);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task3_OnlyZeroNumbers_SumOfPositiveNumbers() {
        int actual = Operators.task3(0, 0, 0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_OnlyPositiveNumbers () {
        int actual = Operators.task4(2, 4, 10);
        int expected = 83;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_OnlyNegativeNumbers () {
        int actual = Operators.task4(-2, -4, -10);
        int expected = -13;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_OnlyZero () {
        int actual = Operators.task4(0, 0, -0);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task4_SumEqualMulti () {
        int actual = Operators.task4(1, 2, 3);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_MarkZero () {
        int actual = Operators.task5 (0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task5_HundredZero () {
        int actual = Operators.task5 (100);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task5_throwException_NegativeNumber () {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Operators.task5(-5),
        "Некорректные данные");
    }

    @Test
    public void test_task5_throwException_NumberUnderRange () {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Operators.task5(101),
                "Некорректные данные");
    }
}



