package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.stats.StatsService;

public class StatasServiceTest {
    @Test
    public void minimalSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int nomberMonth = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, nomberMonth);


    }

    @Test
    public void maximumSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int nomberMonth = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, nomberMonth);

    }

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = service.sumSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected, sum);

    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int average = service.averageSales(sales);
        int expected = 15;
        Assertions.assertEquals(expected, average);

    }

    @Test
    public void belowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int HowMonth = service.belowAverageSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, HowMonth);

    }

    @Test
    public void aboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int HowMonth = service.aboveAverageSales(sales);
        int expected = 5;
        Assertions.assertEquals(expected, HowMonth);

    }
}
