SELECT score, COUNT(users.*) AS number_of_users
FROM users
INNER JOIN reviews
ON users.id = reviews.user_id
GROUP BY score;