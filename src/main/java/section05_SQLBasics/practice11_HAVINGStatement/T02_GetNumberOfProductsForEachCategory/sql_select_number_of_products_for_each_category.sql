SELECT category.name AS category_name, COUNT(product.*) AS number_of_products
FROM category
LEFT JOIN product
ON category.id = product.category_id
GROUP BY category.name
HAVING number_of_products >= 4;