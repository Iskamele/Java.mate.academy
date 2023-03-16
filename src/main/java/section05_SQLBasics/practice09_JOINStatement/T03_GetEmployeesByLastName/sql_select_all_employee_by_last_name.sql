SELECT employee.first_name, employee.last_name, department.name
FROM department
LEFT JOIN employee
ON department.id = employee.department_id
WHERE employee.last_name LIKE '%n%';