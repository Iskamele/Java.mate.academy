SELECT DISTINCT category.name AS category_name, MIN(product.price) AS min_price
FROM product
LEFT JOIN category
ON product.category_id = category.id
GROUP BY category.name;