package codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode_Equals {

    public static void main(String[] args){

        Map<Employee,String> employeeStringMap = new HashMap<>();
        employeeStringMap.put(new Employee(1,"sandeep"),"sandeep");
        employeeStringMap.put(new Employee(1,"sandeep"),"sandeep");
        employeeStringMap.put(new Employee(3,"sandeep"),"sandeep");
        employeeStringMap.put(new Employee(4,"sandeep"),"sandeep");

        System.out.println(employeeStringMap.size());
        employeeStringMap.forEach((employee, s) -> employee.toString());

        Map<String,Employee> empMap = new HashMap<>();
        empMap.put("sandeep", new Employee(0,"sandeep"));
        empMap.put("sandeep", new Employee(1,"sandeep1"));
        empMap.put("sandeep2", new Employee(2,"sandeep2"));
        empMap.put("sandeep3", new Employee(3,"sandeep3"));

        System.out.println(empMap.get("sandeep")+ "size: "+empMap.size());


    }

}

class Employee{

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }
*/

    public int hashCode() {
       //return Objects.hash(id, name);
        return 100;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
