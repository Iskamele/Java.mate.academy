package section04_JavaCore.topic14_HashMap.practice.EmployeeInformation;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EmployeeInformation {
    public List<Employee> getEmployeesByCityAndYearOfBirth(
            Map<Employee, String> employeesInformation, int yearOfBirth, String city) {
        List<Employee> newList = new LinkedList<>();
        for (Map.Entry<Employee, String> entry : employeesInformation.entrySet()) {
            if (entry.getValue().equals(city)
                    && entry.getKey().getYearOfBirth() >= yearOfBirth) {
                newList.add(entry.getKey());
            }
        }
        return newList;
    }
}
