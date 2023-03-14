SELECT MAX(salary) AS max_salary
FROM staff
WHERE date_of_dismissal IS NULL AND position = 'teacher';