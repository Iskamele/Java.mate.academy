SELECT first_name, COUNT(*) AS number_of_pupils
FROM pupil
GROUP BY first_name
ORDER BY first_name;