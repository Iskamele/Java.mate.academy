SELECT first_name, last_name, birth_date
FROM staff
WHERE date_of_dismissal IS NOT NULL
ORDER BY birth_date DESC
LIMIT 1;