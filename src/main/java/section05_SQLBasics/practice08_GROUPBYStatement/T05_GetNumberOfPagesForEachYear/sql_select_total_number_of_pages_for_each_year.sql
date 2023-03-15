SELECT publish_year AS year, SUM(number_of_pages) AS number_of_pages
FROM book
WHERE publish_year BETWEEN 2011 AND 2015
GROUP BY publish_year
ORDER BY publish_year DESC;