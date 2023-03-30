SELECT name, country
FROM people
WHERE country NOT IN ('Canada', 'Mexico', 'USA');