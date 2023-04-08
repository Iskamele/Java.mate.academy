SELECT country, COUNT(*) number_of_men
FROM users
WHERE sex = 'male'
GROUP BY country
HAVING COUNT(*) >= 3 AND COUNT(*) <= 5;