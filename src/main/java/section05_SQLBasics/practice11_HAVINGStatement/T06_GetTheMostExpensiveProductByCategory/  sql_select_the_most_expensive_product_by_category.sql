SELECT category.name AS category_name, MAX(product.price) AS max_price
FROM category
INNER JOIN product
ON category.id = product.category_id
GROUP BY category.name
HAVING COUNT(product.*) >= 3
ORDER BY max_price;