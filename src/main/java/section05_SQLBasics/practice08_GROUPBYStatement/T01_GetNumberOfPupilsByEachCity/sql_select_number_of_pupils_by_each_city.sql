SELECT city, COUNT(*) AS number_of_pupils
FROM pupil
GROUP BY city;