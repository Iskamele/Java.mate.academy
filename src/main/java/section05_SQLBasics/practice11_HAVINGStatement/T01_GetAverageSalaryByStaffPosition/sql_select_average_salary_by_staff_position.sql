SELECT position, AVG(salary) AS average_salary
FROM staff
WHERE date_of_dismissal IS NULL
GROUP BY position
HAVING AVG(salary) >= 10000;