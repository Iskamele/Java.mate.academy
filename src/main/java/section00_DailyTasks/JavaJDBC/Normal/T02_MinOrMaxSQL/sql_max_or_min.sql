SELECT
    CASE
        WHEN MOD(SUM(x), 2) = 0 THEN MAX(x)
        ELSE MIN(x)
        END AS x,
    CASE
        WHEN MOD(SUM(y), 2) = 0 THEN MAX(y)
        ELSE MIN(y)
        END AS y,
    CASE
        WHEN MOD(SUM(z), 2) = 0 THEN MAX(z)
        ELSE MIN(z)
        END AS z
FROM numbers;