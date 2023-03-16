SELECT pupil.first_name, pupil.last_name, AVG(scoreboard.mark) AS average_mark
FROM pupil
INNER JOIN scoreboard
ON pupil.id = scoreboard.pupil_id
GROUP BY pupil.id;