package sortObject;

import model.Employee;
import model.EmployeeSalaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainDriver {

    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(4,"A",1000.0));
        employeeList.add(new Employee(2,"B",500.0));
        employeeList.add(new Employee(1,"F",2800.0));

        EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();

        //sort the object  on Name
       /* Collections.sort(employeeList);

        for (Employee emp: employeeList) {
            System.out.println(emp);
        }*/

        //sort the object by Salary
        Collections.sort(employeeList,employeeSalaryComparator);

        for (Employee emp: employeeList) {
            System.out.println(emp);
        }


        //Using Java8 and Method Reference.
        employeeList.stream().sorted(Comparator.comparing(Employee::getName));
    }


}
