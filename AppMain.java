import domain.collections.EmployeeIterator;
import domain.employee.Employee;
import domain.employee.FreelanceEmployee;
import domain.employee.FullTimeEmployee;
import domain.employee.Names;
import domain.payments.Currency;
import domain.payments.Payment;

public class AppMain {
    static public void main(String[] args){

        Payment fullTimeSalary = new Payment(1000, Currency.RUBLE);
        Payment hourlySalary = new Payment(10, Currency.RUBLE);

        EmployeeIterator employeeIterator = new EmployeeIterator();
        employeeIterator.add(new FreelanceEmployee(new Names("Василий", "Иванов")));
        employeeIterator.add(new FullTimeEmployee(new Names("Иван", "Петров")));
        employeeIterator.add(new FreelanceEmployee(new Names("Ирина", "Сидорова")));
        employeeIterator.add(new FullTimeEmployee(new Names("Марина", "Петрова")));

        for(Employee employee: employeeIterator) {
            if(employee instanceof FreelanceEmployee){
                printMonthSalary(employee, hourlySalary);
            } else if (employee instanceof FullTimeEmployee){
                printMonthSalary(employee, fullTimeSalary);
            }
        }
    }

    static void printMonthSalary(Employee employee, Payment payment){
        String line = String.format("%s: %s", employee.getNames(), employee.calcMonthSalary(payment));
        System.out.println(line);
    }
}
