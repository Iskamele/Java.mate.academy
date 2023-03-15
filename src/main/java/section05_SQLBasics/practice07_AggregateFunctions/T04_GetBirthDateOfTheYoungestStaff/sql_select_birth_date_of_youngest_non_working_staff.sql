SELECT MAX(birth_date) AS birth_date
FROM staff
WHERE date_of_dismissal IS NOT NULL;