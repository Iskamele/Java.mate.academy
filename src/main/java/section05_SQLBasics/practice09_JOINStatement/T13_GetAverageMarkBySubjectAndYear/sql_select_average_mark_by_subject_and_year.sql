SELECT scoreboard.subject, scoreboard.year, AVG(scoreboard.mark) AS average_mark
FROM scoreboard
LEFT JOIN pupil
ON scoreboard.pupil_id = pupil.id
WHERE pupil.birth_date > '2005-01-01'
GROUP BY scoreboard.year, scoreboard.subject
ORDER BY scoreboard.subject ASC, scoreboard.year DESC;