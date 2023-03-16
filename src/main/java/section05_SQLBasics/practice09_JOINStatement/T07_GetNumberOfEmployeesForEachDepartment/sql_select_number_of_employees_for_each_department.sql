SELECT department.name AS department_name, COUNT(employee.*) AS number_of_employees
FROM employee
         INNER JOIN department
                    ON employee.department_id = department.id
GROUP BY department.name;