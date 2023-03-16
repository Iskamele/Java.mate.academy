SELECT department.name AS department_name, AVG(employee.salary) AS average_salary, COUNT(employee.*) AS number_of_employees
FROM department
INNER JOIN employee
ON department.id = employee.department_id
GROUP BY department.name;