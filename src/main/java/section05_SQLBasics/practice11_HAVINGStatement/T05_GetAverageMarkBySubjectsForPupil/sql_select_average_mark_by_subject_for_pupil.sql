SELECT scoreboard.subject, AVG(scoreboard.mark) AS average_mark
FROM pupil
INNER JOIN scoreboard
ON pupil.id = scoreboard.pupil_id
WHERE pupil.first_name = 'Eugen' AND pupil.last_name = 'Tsven'
GROUP BY scoreboard.subject
HAVING average_mark >= 10;