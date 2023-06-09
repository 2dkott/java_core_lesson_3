package domain.employee;

import domain.payments.Payment;
import domain.payments.PaymentCalc;

public class FreelanceEmployee extends Employee {

    public FreelanceEmployee(Names names) {
        super(names);
    }

    @Override
    public Payment calcMonthSalary(Payment payment) {
        return PaymentCalc.calcNetMonthHourlySalary(payment);
    }
}
