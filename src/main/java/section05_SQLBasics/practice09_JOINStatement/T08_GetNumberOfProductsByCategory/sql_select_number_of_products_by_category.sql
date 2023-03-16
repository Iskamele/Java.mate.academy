SELECT category.name AS category_name, COUNT(product.amount) AS number_of_products
FROM category
INNER JOIN product
ON category.id = product.category_id
WHERE category.name IN ('Meat', 'Grains')
GROUP BY category.name;