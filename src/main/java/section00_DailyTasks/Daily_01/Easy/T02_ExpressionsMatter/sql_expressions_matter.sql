SELECT GREATEST(
            x + y + z,
            x * y * z,
            x + y * z,
            x * y + z,
            (x + y) * z,
            x * (y + z),
            (x * y) + z,
            x * (y * z)
           ) as max_result
FROM numbers;