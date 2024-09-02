package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        // Employees from IT departnment whose age is >45 and < 60 and group them based on gender

        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setDepartment("IT");
        employee1.setGender("M");
        employee1.setDob(new Date(1970, 06, 12));

        Employee employee2 = new Employee();
        employee2.setDepartment("IT");
        employee2.setGender("F");
        employee2.setDob(new Date(1970, 06, 12));

        Employee employee3 = new Employee();
        employee3.setDepartment("CSE");
        employee3.setGender("M");
        employee3.setDob(new Date(1940, 06, 12));

        employeeList = List.of(employee1, employee2, employee3);

        Map<String, Long> employeeCountBasedOnGender = employeeList.stream().filter(emp -> {
            if("IT".equals(emp.getDepartment())) {
                Date dob = emp.getDob();
                LocalDate localDate = LocalDate.now();
                int age = localDate.getYear() - dob.getYear();
                if(age > 45 && age < 60) {
                    return true;
                }
            }
            return false;
        }  ).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("employeeCountBasedOnGender " +employeeCountBasedOnGender);
    }
}
