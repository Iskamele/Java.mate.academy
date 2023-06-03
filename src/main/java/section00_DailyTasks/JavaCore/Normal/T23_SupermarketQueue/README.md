В супермаркете`Mate`существует очередь к кассам самообслуживания. Твоя задача - реализовать
метод`calculateTotalTime()`для расчета общего времени, необходимого всем покупателям для оформления
и оплаты заказа.

Метод принимает:

- массив целых положительных чисел`customers`, представляющих очередь. Каждое целое число
  представляет покупателя, и его значение - это количество времени, которое ему требуется для
  оплаты
- целое положительное число`checkout`, представляющее количество касс

Примечания:

- существует только одна очередь, касс может быть несколько
- порядок очереди никогда не меняется
- первый человек в очереди (т.е. первый элемент в массиве) проходит к кассе, как только она
  освобождается

Примеры:

```
calculateTotalTime({5, 3, 4}, 1) == 12
// когда есть 1 касса, общее время - это просто сумма времени всех покупателей

calculateTotalTime({10, 2, 3, 3}, 2) == 10
// 2-й, 3-й и 4-й человек в очереди заканчивает оплату до того, как закончил 1-й человек

calculateTotalTime({2, 3, 10}, 2) == 12
```