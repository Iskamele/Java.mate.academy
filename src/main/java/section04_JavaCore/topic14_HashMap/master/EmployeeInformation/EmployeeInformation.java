package section04_JavaCore.topic14_HashMap.master.EmployeeInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeInformation {
    public List<Employee> getEmployeesByCityAndYearOfBirth(
            Map<Employee, String> employeesInformation, int yearOfBirth, String city) {
        // variable for storing filtered employees
        List<Employee> employees = new ArrayList<>();
        // iterate through every element in map
        for (Map.Entry<Employee, String> employeeInfo : employeesInformation.entrySet()) {
      /*
        check if employee lives in needed city
        and if his year of birth is greater or equal to needed one
      */
            if (employeeInfo.getValue().equals(city)
                    && employeeInfo.getKey().getYearOfBirth() >= yearOfBirth) {
                // add employee to list if he's valid
                employees.add(employeeInfo.getKey());
            }
        }
        // return filtered employees
        return employees;
    }
}
