package domain.employee;

import domain.payments.Payment;
import domain.payments.PaymentCalc;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(Names names) {
        super(names);
    }
    @Override
    public Payment calcMonthSalary(Payment payment) {
        return PaymentCalc.calcNetFullTimeSalary(payment);
    }
}
