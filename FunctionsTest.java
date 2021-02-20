package Functions;

import Functions.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class FunctionsTest {
    @Test
    public void test_task1_Wednesday_DayNumber() {
        int actual = Functions.DayNumber(3);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task1_NoDayNumber_DayNumber() {
        int actual = Functions.DayNumber(11);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_PositiveCoordinates_Distance() {
        double actual = Functions.Distance(1, 6, 5, 9);
        double expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_NegativeCoordinates_Distance() {
        double actual = Functions.Distance(-1, -6, -5, -9);
        double expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_ZeroCoordinates_Distance() {
        double actual = Functions.Distance(0, 0, 0, 0);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task2_SameCoordinatesOfPoints_Distance() {
        double actual = Functions.Distance(6, 21, 6, 21);
        double expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_0_StringOfNumber() {
        String actual = Functions.StringOfNumber(0);
        String expected = "ноль";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_20_StringOfNumber() {
        String actual = Functions.StringOfNumber(20);
        String expected = "двадцать";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_25_StringOfNumber() {
        String actual = Functions.StringOfNumber(25);
        String expected = "двадцать пять";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_50_StringOfNumber() {
        String actual = Functions.StringOfNumber(50);
        String expected = "пятдесят";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_100_StringOfNumber() {
        String actual = Functions.StringOfNumber(100);
        String expected = "сто";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_500_StringOfNumber() {
        String actual = Functions.StringOfNumber(500);
        String expected = "пятьсот";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_900_StringOfNumber() {
        String actual = Functions.StringOfNumber(900);
        String expected = "девятьсот";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task3_547_StringOfNumber() {
        String actual = Functions.StringOfNumber(547);
        String expected = "пятьсот сорок семь";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_0_getNumberFromString() {
        int actual = Functions.getNumberFromString("ноль");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_20_getNumberFromString() {
        int actual = Functions.getNumberFromString("двадцать");
        int expected = 20;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_task4_35_getNumberFromString() {
        int actual = Functions.getNumberFromString("тридцать пять");
        int expected = 35;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task4_222_getNumberFromString() {
        int actual = Functions.getNumberFromString("двести двадцать два");
        int expected = 222;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task4_842_getNumberFromString() {
        int actual = Functions.getNumberFromString("восемьсот сорок два");
        int expected = 842;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_task4_999_getNumberFromString() {
        int actual = Functions.getNumberFromString("девятьсот девяносто девять");
        int expected = 999;
        Assertions.assertEquals(expected, actual);
    }
}
