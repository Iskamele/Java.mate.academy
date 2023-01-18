package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        List<Employee> users = new ArrayList<>();
        users.add(new Employee("Bob", 23, "male", "380995488776"));
        users.add(new Employee("Alice", 22, "female", "380985488576"));
        users.add(new Employee("John", 27, "male", "380663488776"));
        users.add(new Employee("Bob", 27, "male", "380995483776"));
        users.add(new Employee("Bob", 29, "male", "380505488776"));

        System.out.println(employeeService.getEmployeesByOrder(users));
    }
}
