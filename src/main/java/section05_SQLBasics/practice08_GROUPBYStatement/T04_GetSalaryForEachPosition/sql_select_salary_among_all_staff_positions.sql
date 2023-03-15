SELECT position, MAX(salary) AS max_salary
FROM staff
GROUP BY position;