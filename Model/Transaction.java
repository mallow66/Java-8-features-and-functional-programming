package FunctionalProgramming.Model;

/**
 * Created by brahim on 5/31/17.
 */
public class Transaction {

    private final Trader trader;
    private final int year;
    private final int value;


    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "("+trader+"-"+value+")";
    }
}
