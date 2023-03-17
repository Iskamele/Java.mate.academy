SELECT EXTRACT(YEAR FROM date_of_hiring) AS year, COUNT(*) AS number_of_staff
FROM staff
GROUP BY year;