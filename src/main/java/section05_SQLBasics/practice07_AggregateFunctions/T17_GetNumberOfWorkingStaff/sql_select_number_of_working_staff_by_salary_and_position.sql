SELECT COUNT(*) AS number_of_staff
FROM staff
WHERE date_of_dismissal IS NULL AND position = 'teacher' AND salary >= 9000;