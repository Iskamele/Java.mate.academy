SELECT first_name, last_name, department.name AS department_name
FROM employee
LEFT JOIN department
ON department.id = employee.department_id
WHERE department.id IN (2, 7);