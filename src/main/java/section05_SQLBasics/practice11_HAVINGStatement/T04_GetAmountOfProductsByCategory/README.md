Дано таблицы category и product.

Найди названия категорий, в которых сумма количества всех товаров составляет более 80.

Результат должен содержать столбцы:

category_name — название категории;
total_amount — сумма количества всех товаров для каждой категории.
Обрати внимание: не забудь сгруппировать результат.

_______category_____
| id |    name      |
| 2  | Seafood      |
.....................
| 4  | Grains       |

__________________________product_____________________
| id | name        | amount   | price   | category_id |
| 2  | Shrimp      | 50       | 450     | 2           |
.......................................................
| 8  | Flour       | 20       | 60      | 4           |