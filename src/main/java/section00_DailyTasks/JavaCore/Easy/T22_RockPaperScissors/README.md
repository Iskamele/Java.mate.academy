Сыграем в 'Камень, ножницы, бумага'!

Реализуй метод`play()`, который принимает две строки`player1`и`player2`, представляющие ходы
игроков.

Правила следующие:

- камень побеждает ножницы;
- ножницы побеждают бумагу;
- бумага побеждает камень.

Метод должен вернуть строку:

- `"Player 1 won!"`, если первый игрок побеждает второго;
- `"Player 2 won!"`, если второй игрок побеждает первого;
- `"Draw!"`, если оба игрока показывают одинаковый знак.

Примеры:

```
play("scissors", "paper") ==> "Player 1 won!"
play("scissors", "rock") ==> "Player 2 won!"
play("paper", "paper") ==> "Draw!"
```