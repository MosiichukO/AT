package Cycles;

import Cycles.Cycles;
import Operators.Operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;

public class CyclesTest {
    @Test
    public void test_task1SumForTest_SumAndCountEvenNumbers() {
        Assertions.assertEquals(Cycles.task1_SumForTest(), 2450);
    }

    @Test
    public void test_task1CountForTest_SumAndCountEvenNumbers() {
        Assertions.assertEquals(Cycles.task1_CountForTest(), 49);

    }

    @Test
    public void test_task2_FirstPrime_PrimeNumber() {
        int actual = Cycles.task2(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_NotPRime_PrimeNumber() {
        int actual = Cycles.task2(4);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_Zero_PrimeNumber() {
        int actual = Cycles.task2(0);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_Negative_PrimeNumber() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.task2(-10),
                "Простые числа больше 0");
    }

    @Test
    public void test_task3_PositiveNumber_StepByStepMethod() {
        int actual = Cycles.task3_StepByStepMethod(144);
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_Zero_StepByStepMethod() {
        int actual = Cycles.task3_StepByStepMethod(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_NegativeNumber_StepByStepMethod() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.task3_StepByStepMethod(-2),
                "Корень вычитается только с положительных чисел");
    }

    @Test
    public void test_task3_Zero_BinaryMethod() {
        int actual = Cycles.task3_BinaryMethod(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_PositiveNumber_BinaryMethod() {
        int actual = Cycles.task3_BinaryMethod(169);
        int expected = 13;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_NegativeNumber_BinaryMethod() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.task3_BinaryMethod(-9),
                "Корень вычитается только с положительных чисел");
    }

    @Test
    public void test_task4_PositiveNumber_Factorial() {
        int actual = Cycles.task4(5);
        int expected = 120;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_Zero_Factorial() {
        int actual = Cycles.task4(0);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_One_Factorial() {
        int actual = Cycles.task4(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_NegativeNumber_Factorial() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.task4(-10),
                "Факториал применяется только к натуральным числам");
    }

    @Test
    public void test_task5_One_SumOFElementsOfNumber() {
        int actual = Cycles.task5(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_Zero_SumOFElementsOfNumber() {
        int actual = Cycles.task5(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_Thousands_SumOFElementsOfNumber() {
        int actual = Cycles.task5(3467);
        int expected = 20;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task5_Negative_SumOFElementsOfNumber() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Cycles.task4(-10),
                "Число должно быть положительним");
    }

    @Test
    public void test_task6_Zero_MirrorChangeNumber() {
        int actual = Cycles.task6(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_Positive_MirrorChangeNumber() {
        int actual = Cycles.task6(1457);
        int expected = 7541;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task6_NumberWithZeroPart_MirrorChangeNumber() {
        int actual = Cycles.task6(100);
        int expected = 001;
        Assertions.assertEquals(expected, actual);
    }
}



