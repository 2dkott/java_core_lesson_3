package domain.payments;

public class PaymentCalc {

    static double taxValue = 13;

    public static Payment calcNetFullTimeSalary(Payment fullTimePayment){
        double taxAmount = fullTimePayment.getAmount() * taxValue;
        return new Payment(fullTimePayment.getAmount() - taxAmount, fullTimePayment.getCurrency());
    }

    public static Payment calcNetMonthHourlySalary(Payment hourlyPayment){
        double monthAmount = 20.8 * 8 * hourlyPayment.getAmount();
        double taxAmount = monthAmount * taxValue;
        return new Payment(monthAmount - taxAmount, hourlyPayment.getCurrency());
    }
}
