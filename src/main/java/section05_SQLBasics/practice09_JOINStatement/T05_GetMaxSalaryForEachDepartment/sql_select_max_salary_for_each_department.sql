SELECT department.name AS department_name, MAX(employee.salary) AS max_salary
FROM department
INNER JOIN employee
ON department.id = employee.department_id
GROUP BY department.name