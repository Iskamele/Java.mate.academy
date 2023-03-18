SELECT category.name AS category_name, SUM(product.amount) AS total_amount
FROM category
INNER JOIN product
ON category.id = product.category_id
GROUP BY category.name
HAVING total_amount > 80;