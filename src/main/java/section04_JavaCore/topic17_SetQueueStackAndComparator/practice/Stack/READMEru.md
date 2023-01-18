Реализуйте все методы в классе Stack.

Ваша реализация должна быть основана на массиве или односвязном списке (не используйте существующие коллекции).

Создайте ``EmptyStackException`, где это необходимо.

#### [Старайтесь избегать этих распространенных ошибок при решении задачи](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack)

### Распространенные ошибки[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#common-mistakes)

#### Не используйте магические числа в коде[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack# не используйте-магические-числа-в-коде)

Ваш код должен легко читаться. Переместите все жестко заданные значения в [константные поля](https://mate-academy.github.io/style-guides/java/java.html#s5.2.4-constant-names) и дайте им информативные имена.

#### Не используйте геттеры и сеттеры в классе Node[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack #dont-use-getters-and-setters-in-class-node)

У нас есть доступ к приватным полям внутреннего класса, поэтому использование геттеров или сеттеров излишне.

#### Класс Node Parameterize[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#parameterize-node-class)

Класс `Node` принимает значение, поэтому мы должны параметризовать его, чтобы предотвратить проблемы с типами данных.

#### Не используйте модификаторы открытого доступа везде[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#dont -использовать-общедоступные-модификаторы-везде)

Если метод имеет только служебную цель и используется только внутри одного и того же класса, он не должен быть ``общедоступным`. Держите свой код как можно ближе к принципу инкапсуляции.

#### Избегайте модификаторов доступа по умолчанию[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#avoid-default-access -модификаторы)

Все поля и методы должны иметь модификаторы доступа. Помните о принципе инкапсуляции.

#### Именование переменных[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#variable-naming)

Неправильное название может существенно повлиять на читабельность вашего кода!

```
Плохое название:
     Т[]а;
```

```
Хорошее название:
     стек Т[];
```

#### Если ваша реализация основана на массиве, используйте аннотацию `@SuppressWarnings("unchecked")`, если тест завершился с ошибкой: `использует непроверенные или небезопасные операции`[](https://mate-academy.github .io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#if-your-implementation-is-based-on-an-array-use-annotation-suppresswarningsunchecked-if-test -сбой-с-ошибкой-использует-непроверенные-или-небезопасные-операции)

Подавление предупреждения с помощью @SuppressWarnings («не проверено») сообщает компилятору, что программист считает код безопасным и не вызовет непредвиденных исключений.

```
Пример:
@SuppressWarnings("не отмечено")
открытый класс Stack<T> {
}
```