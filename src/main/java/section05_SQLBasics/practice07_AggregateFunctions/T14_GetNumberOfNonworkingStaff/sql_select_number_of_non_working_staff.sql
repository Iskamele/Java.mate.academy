SELECT COUNT(*) AS non_working_staff
FROM staff
WHERE date_of_dismissal IS NOT NULL;