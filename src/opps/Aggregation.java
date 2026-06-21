package opps;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {

    public static void main(String[] args) {
        Employee e1 = new Employee();

        Employee e2 = new Employee();

        List<Employee> employees = List.of(e1, e2);

        Department department = new Department(employees);

        
    }

}

class Employee {
    String name;
}


class Department {
    List<Employee> employees;

    Department(List<Employee> employees){
        this.employees = employees;
    }
}