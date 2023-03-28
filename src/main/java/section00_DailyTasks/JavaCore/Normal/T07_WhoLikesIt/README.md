- Тебе, наверное, знакома система 'лайков' в Facebook и других соцсетях. Люди могут 'лайкать' посты
  в блоге, картинки и т.д. Давай создадим текст, который должен отображаться рядом с таким постом.

  Реализуй метод`whoLikesIt()`, который принимает массив строк`names`, содержащий имена людей,
  которым нравится какой-то пост. Метод должен вернуть текст, как показано в примерах:

  ```
  whoLikesIt([]) ==> "No one likes this"
  whoLikesIt(["Peter"]) ==> "Peter likes this"
  whoLikesIt(["Jacob", "Alex"]) ==> "Jacob and Alex like this"
  whoLikesIt(["Max", "John", "Mark"]) ==> "Max, John and Mark like this"
  whoLikesIt(["Alex", "Jacob", "Mark", "Max"]) ==> "Alex, Jacob and 2 others like this"
  ```