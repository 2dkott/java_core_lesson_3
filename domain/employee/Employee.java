package domain.employee;

import domain.payments.Payment;

import java.util.UUID;

public abstract class Employee implements Comparable<Employee>{

    final private String employeeId;
    final private Names names;


    public Employee(Names names){
        this.employeeId = UUID.randomUUID().toString();
        this.names = names;
    }
    abstract public Payment calcMonthSalary(Payment payment);

    @Override
    public int compareTo(Employee o) {
        return names.compareTo(o.getNames());
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Names getNames() {
        return names;
    }
}
