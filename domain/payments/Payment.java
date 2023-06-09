package domain.payments;

public class Payment {
    private final double amount;

    private final Currency currency;

    public Payment(double salary, Currency currency) {
        this.amount = salary;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
