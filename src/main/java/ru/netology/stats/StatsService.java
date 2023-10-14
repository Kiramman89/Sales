package ru.netology.stats;

public class StatsService {
    public long total(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;

        }
        return allSales;
    }

    public long averageSale(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        long averageSale = allSales / 12;
        return averageSale;
    }

    public int maxSaleMonth(long[] sales) {
        int peakMonth = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] >= sales[peakMonth]) {
                peakMonth = i;
            }
        return peakMonth + 1;
    }

    public int minSaleMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        return minMonth + 1;
    }

    public int belowAverageMonths(long[] sales) {
        int belowMonths = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                belowMonths++;
            }
        }

        return belowMonths;
    }

    public int aboveAverageMonths(long[] sales) {
        int aboveMonths = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                aboveMonths++;
            }
        }

        return aboveMonths;
    }
}