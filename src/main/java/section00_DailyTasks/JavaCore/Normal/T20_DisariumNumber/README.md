**Disaruim**- это число, в котором сумма цифр, приведенных в степень, соответствующую их положению
в числе, равна самому числу.

Например:

```
number = 135
1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
```

Реализуй метод`isDisarium()`, который принимает неотрицательное целое число`number`и проверяет,
являетси ли оно disarium.

Примеры:

```
isDisarium(89) ==> true // 8^1 + 9^2 = 8 + 81 = 89
isDisarium(24) ==> false // 2^1 + 4^2 = 2 + 16 = 18
```