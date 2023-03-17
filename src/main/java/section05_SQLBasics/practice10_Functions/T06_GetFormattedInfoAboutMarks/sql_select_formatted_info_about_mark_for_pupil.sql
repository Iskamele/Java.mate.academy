SELECT CONCAT(pupil.first_name, ' ', pupil.last_name, ': ', scoreboard.subject, ' - ', AVG(scoreboard.mark)) AS pupil_mark
FROM pupil
INNER JOIN scoreboard
ON pupil.id = scoreboard.pupil_id
WHERE pupil.id = 3
GROUP BY scoreboard.subject, pupil.first_name, pupil.last_name;