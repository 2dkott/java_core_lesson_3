package domain.collections;

import domain.employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeIterator implements Iterable<Employee>{

    final protected List<Employee> list = new ArrayList<>();

    public void add(Employee employee){
        list.add(employee);
    }
    @Override
    public Iterator<Employee> iterator() {
        return new empIterator();
    }

    class empIterator implements Iterator<Employee> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != list.size();
        }

        @Override
        public Employee next() {
            Employee currentEmployee =  list.get(cursor);
            cursor+=1;
            return currentEmployee;
        }
    }
}
