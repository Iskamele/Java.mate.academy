Дано таблицы category и product.

Отобрази информацию о каждом из продуктов в категории Beverages в виде: [product name] - [amount] units. Для результирующего столбца создай псевдоним — product_information.

Например:

Tea - 42 units
Water - 51 units

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