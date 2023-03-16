SELECT scoreboard.subject AS subject, AVG(scoreboard.mark) AS average_mark
FROM pupil
INNER JOIN scoreboard
ON pupil.id = scoreboard.pupil_id
WHERE pupil.first_name = 'Anna' AND pupil.last_name = 'Ivaniuk'
GROUP BY scoreboard.subject
ORDER BY average_mark DESC;