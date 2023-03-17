SELECT first_name, last_name, EXTRACT(DAY FROM date_of_dismissal) AS day, EXTRACT(MONTH FROM date_of_dismissal) AS month, EXTRACT(YEAR FROM date_of_dismissal) AS year
FROM staff
WHERE date_of_dismissal IS NOT NULL;