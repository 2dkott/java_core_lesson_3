package domain.payments;

public class PaymentCalc {

    static double taxValue = 13;

    public static Payment calcNetFullTimeSalary(Payment fullTimePayment){
        return new Payment(fullTimePayment.getAmount() - calcTax(fullTimePayment.getAmount()), fullTimePayment.getCurrency());
    }

    public static Payment calcNetMonthHourlySalary(Payment hourlyPayment){
        double monthAmount = 20.8 * 8 * hourlyPayment.getAmount();
        return new Payment(monthAmount - calcTax(monthAmount), hourlyPayment.getCurrency());
    }

    private static double calcTax(double amount){
        return (amount * taxValue)/100;
    }
}
