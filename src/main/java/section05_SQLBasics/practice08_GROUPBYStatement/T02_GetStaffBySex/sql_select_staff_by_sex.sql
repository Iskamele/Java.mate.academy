SELECT sex, COUNT(*) AS number_of_staff
FROM staff
WHERE date_of_dismissal IS NULL
GROUP BY sex;