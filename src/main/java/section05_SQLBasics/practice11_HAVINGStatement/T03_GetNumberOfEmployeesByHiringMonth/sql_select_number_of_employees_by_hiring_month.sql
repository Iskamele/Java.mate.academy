SELECT EXTRACT(MONTH FROM hiring_date) AS month, COUNT(*) AS number_of_employees
FROM employee
GROUP BY month
HAVING number_of_employees >= 3;