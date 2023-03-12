SELECT name, weight, price
FROM dish
WHERE price BETWEEN 90 AND 125
ORDER BY price DESC, weight;