package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.Comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    Comparator<Employee> employeeComparator = new Comparator<>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            int comparedAge = Integer.compare(employee1.getAge(), employee2.getAge());
            return comparedAge != 0 ? comparedAge : employee1.getName().compareTo(employee2.getName());
        }
    };

    public Set<Employee> getEmployeesByOrder(List<Employee> employees) {
        Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
