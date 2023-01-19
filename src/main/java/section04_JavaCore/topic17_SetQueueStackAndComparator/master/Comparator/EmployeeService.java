package section04_JavaCore.topic17_SetQueueStackAndComparator.master.Comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
  public Set<Employee> getEmployeesByOrder(List<Employee> employees) {
    // variable for storing of custom comparator
    Comparator<Employee> employeeComparator = new Comparator<>() {
      @Override
      public int compare(Employee firstEmployee, Employee secondEmployee) {
        // if the age is the same, sort by their name
        if (firstEmployee.getAge() == secondEmployee.getAge()) {
          // use method compareTo() of String class that sort alphabetically by default
          return firstEmployee.getName().compareTo(secondEmployee.getName());
        }
        // sort employees from younger to older
        return firstEmployee.getAge() < secondEmployee.getAge() ? -1 : 1;
      }
    };
    // variable for storing sorted employees,
    Set<Employee> sortedEmployees = new TreeSet<>(employeeComparator);
    // add all employees to set to sort them
    sortedEmployees.addAll(employees);
    // return sorted employees
    return sortedEmployees;
  }
}
