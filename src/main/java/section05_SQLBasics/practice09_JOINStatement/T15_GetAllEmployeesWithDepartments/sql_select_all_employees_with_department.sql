SELECT department.name AS department_name, employee.first_name, employee.last_name
FROM department
RIGHT JOIN employee
ON department.id = employee.department_id;