SELECT DISTINCT category.name
FROM category
INNER JOIN product
ON category.id = product.category_id
WHERE product.price < 300;