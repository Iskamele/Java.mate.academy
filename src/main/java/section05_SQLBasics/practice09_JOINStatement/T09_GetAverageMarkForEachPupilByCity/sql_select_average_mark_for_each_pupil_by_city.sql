SELECT scoreboard.subject AS subject, AVG(scoreboard.mark) AS average_mark
FROM scoreboard
LEFT JOIN pupil
ON scoreboard.pupil_id = pupil.id
WHERE pupil.city = 'Kyiv'
GROUP BY scoreboard.subject;