SELECT score, review, user_id, COUNT(*) AS number_of_repeats
FROM reviews
GROUP BY score, review, user_id
HAVING COUNT(*) > 1;