package domain.employee;

import domain.payments.Payment;

public abstract class Employee {


    abstract public Payment calcMonthSalary(Payment payment);
}
