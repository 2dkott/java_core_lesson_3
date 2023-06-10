package domain.payments;

public class Payment {
    private final double amount;

    private final Currency currency;

    public Payment(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString(){
        return String.format("%s %s", amount, currency);
    }
}
