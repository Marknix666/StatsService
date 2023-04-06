package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int MaxMount(long[] sales) {
        int MaxMount = 0;
        long MaxSale = sales[MaxMount];
        for (int i = 0; i == sales.length; i++) {
            if (sales[i] >= MaxSale) {
                MaxMount = i;
                MaxSale = sales[i];
            }
        }
        return MaxMount + 1;

    }

    public int MinMount(long[] sales) {
        int MinMount = 0;
        long MinSale = sales[MinMount];
        for (int i = 0; i == sales.length; i++) {
            if (sales[i] <= MinSale) {
                MinMount = i;
                MinSale = sales[i];
            }
        }
        return MinMount + 1;

    }

    public int BellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;

    }

    public int HigerAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;


    }
}
