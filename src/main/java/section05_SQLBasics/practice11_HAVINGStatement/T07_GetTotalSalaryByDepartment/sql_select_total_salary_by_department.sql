SELECT department.name AS department_name, SUM(employee.salary) AS amount_of_money
FROM department
INNER JOIN employee
ON department.id = employee.department_id
GROUP BY department.name
HAVING COUNT(employee.*) > 3
ORDER BY amount_of_money DESC;