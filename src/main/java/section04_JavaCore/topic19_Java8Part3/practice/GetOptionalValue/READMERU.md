Завершите реализацию методов generateRandomOptional() и getOptionalValue().

`generateRandomOptional()` должна возвращать значениеOptional, содержащее значениеrandomNumber, если randomNumber нечетное значение, или пустое значениеOptional, если `randomNumber` четное значение.

`getOptionalValue()` должен вызывать `generateRandomOptional()`, получать необязательный параметр и возвращать его значение. Если значение отсутствует, должно быть сгенерировано исключение NoSuchElementException.