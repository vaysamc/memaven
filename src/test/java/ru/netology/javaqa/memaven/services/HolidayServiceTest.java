package ru.netology.javaqa.memaven.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.memaven.services.HolidayService;

public class HolidayServiceTest {
    @Test
    void shouldCalculateWhenSalaryTenThous() {
        HolidayService service = new HolidayService();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        // ожидаемое 1

        // вызываем целевой метод:
        int actual = service.calculate(expenses, income, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateWhenSalaryHundredThous() {
        HolidayService service = new HolidayService();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
// ожидаемое 3

        // вызываем целевой метод:
        int actual = service.calculate(expenses, income, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
