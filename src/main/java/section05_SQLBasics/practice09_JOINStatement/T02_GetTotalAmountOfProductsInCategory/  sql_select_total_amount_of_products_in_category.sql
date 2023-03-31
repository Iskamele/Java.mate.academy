SELECT SUM(product.amount) AS total_amount
FROM category
LEFT JOIN product
ON category.id = product.category_id
WHERE category.name = 'Seafood';