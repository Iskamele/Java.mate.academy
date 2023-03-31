-   Реализуй метод `getCharacterAtPosition()`, который принимает список строк `strings` и целое неотрицательное число `position`.

    Метод должен возвращать список символов на этой позиции из каждой строки из списка `strings`.

    Символы в списке должны быть в нижнем регистре и отсортированы в алфавитном порядке.

    Примечания:

    -   Если `strings` содержит `null`, просто пропусти его.
    -   Используй Stream API для решения этой задачи.

    Примеры:

    ```
    getCharacterAtPosition(["java"], 2) ==> ['v']
    getCharacterAtPosition(["GET", "correct", "ChaRs"], 1) ==> ['e', 'h', 'o']
    getCharacterAtPosition(["foo", null, "bar"], 0) ==> ['b', 'f'] // null пропускается
    ```