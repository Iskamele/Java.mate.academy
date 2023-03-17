SELECT CONCAT(product.name, ' - ', product.amount, ' units') AS product_information
FROM category
INNER JOIN product
ON category.id = product.category_id
WHERE category.name = 'Beverages';