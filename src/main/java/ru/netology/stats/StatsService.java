package ru.netology.stats;

public class StatsService {

    //1. Расчет суммы всех продаж
    public long calculateSum(long[] sales) {
        long summary = 0;
        for (long sale : sales) {
            summary += sale;
        }
        return summary;
    }

    //2. Расчет средней суммы всех продаж в месяц
    public long calculateAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    //3. Расчет номера месяца с максимальными продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4. Расчет номера месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5. Расчет кол-ва месяцев, в которых продажи были ниже среднего
    public int underAverage(long[] sales) {
        int underAvgMonth = 0;
        for (long sale : sales) {
            if (sale < calculateAverage(sales)) {
                underAvgMonth = underAvgMonth + 1;
            }
        }
        return underAvgMonth;
    }

    //6. Расчет кол-ва месяцев, в которых продажи были выше среднего
    public int overAverage(long[] sales) {
        int overAvgMonth = 0;
        for (long sale : sales) {
            if (sale > calculateAverage(sales)) {
                overAvgMonth = overAvgMonth + 1;
            }
        }
        return overAvgMonth;
    }
}