Реализуй метод`countIPBetween()`, который принимает два`IPv4`адреса`start`и`end`, и возвращает
количество адресов между ними (включая первый, исключая последний).

Примечания:

- Все входные данные будут действительными адресами`IPv4`в виде строк
- Последний адрес всегда будет больше первого

Примеры:

```
countIPBetween("10.0.0.0", "10.0.0.50") == 50
countIPBetween("10.0.0.0", "10.0.1.0") == 256
countIPBetween("20.0.0.10", "20.0.1.0") == 246
```