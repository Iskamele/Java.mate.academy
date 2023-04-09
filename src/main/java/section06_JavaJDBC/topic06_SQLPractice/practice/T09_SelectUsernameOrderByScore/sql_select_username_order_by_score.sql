SELECT username, score
FROM users
INNER JOIN reviews
ON users.id = reviews.user_id
ORDER BY score DESC, username
LIMIT 3;