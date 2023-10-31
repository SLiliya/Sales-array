package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }

        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = 0;

        int i;
        for (i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int average = (sum / i);

        return average;
    }

    public int belowAverageSales(long[] sales) {

        long averageSale = averageSales(sales);

        int Month = 0;

        for (int x = 0; x < sales.length; x++) {
            if (sales[x] < averageSale) { // значит, в рассматриваемом i-м месяце продаж меньше
                Month++; // запомним его как минимальный
            }
        }

        return Month; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int aboveAverageSales(long[] sales) {
        long averageSale = averageSales(sales);
        int Month = 0;

        for (int x = 0; x < sales.length; x++) {
            if (sales[x] > averageSale) { // значит, в рассматриваемом i-м месяце продаж меньше
                Month++; // запомним его как минимальный
            }
        }

        return Month; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
}
