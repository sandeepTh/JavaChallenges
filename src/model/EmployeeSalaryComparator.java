package model;


import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getSalary().compareTo(t1.getSalary());
    }
}
