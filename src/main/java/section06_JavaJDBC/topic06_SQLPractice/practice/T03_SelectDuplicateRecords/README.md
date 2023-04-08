Дана таблица reviews:

_____________reviews________________            
|id| score |   review     | user_id |
| 1|  5    |Great product!|     1   |
....................................
| 6|  4    |Good enough   |     4   |

Напишите SQL-запрос для извлечения повторяющихся записей из таблицы reviews.

Результат должен содержать четыре столбца: score, review, user_id и number_of_repeats.

Пример:

_____________reviews________________            
|id| score |   review     | user_id |
| 1|  5    |Great product!|     1   |
....................................
| 3|  5    |Great product!|     1   |

Эти записи дублируются, потому что score, review и user_id совпадают.