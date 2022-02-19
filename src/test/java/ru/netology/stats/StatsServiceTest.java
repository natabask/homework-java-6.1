package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    //1. Тестируем расчет суммы всех продаж
    @org.junit.jupiter.api.Test
     void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long axtual = service.calculateSum(sales);

        assertEquals(expected, axtual);
    }

    //2. Тестируем расчет средней суммы всех продаж в месяц
    @org.junit.jupiter.api.Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long axtual = service.calculateAverage(sales);

        assertEquals(expected, axtual);
    }

    //3. Тестируем расчет номера месяца с максимальными проджами
    @org.junit.jupiter.api.Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long axtual = service.maxSales(sales);

        assertEquals(expected, axtual);
    }

    //4. Тестируем расчет номера месяца с минимальными проджами
    @org.junit.jupiter.api.Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long axtual = service.minSales(sales);

        assertEquals(expected, axtual);
    }

    //5. Тестируем расчет кол-ва месяцев, в которых продажи были ниже среднего
    @org.junit.jupiter.api.Test
    void shouldCalculateUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long axtual = service.underAverage(sales);

        assertEquals(expected, axtual);
    }

    //6. Тестируем расчет кол-ва месяцев, в которых продажи были выше среднего
    @org.junit.jupiter.api.Test
    void shouldCalculateOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long axtual = service.overAverage(sales);

        assertEquals(expected, axtual);
    }
}