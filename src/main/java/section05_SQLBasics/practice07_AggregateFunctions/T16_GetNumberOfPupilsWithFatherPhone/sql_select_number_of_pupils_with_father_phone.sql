SELECT COUNT(*) AS number_of_pupils
FROM pupil
WHERE father_phone IS NOT NULL;