Реализуй метод`extractFileName()`, который принимает строку`dirtyFileName`.

Необходимо вернуть строку с именем файла и его расширением.

Сама строка`dirtyFileName`предоставлена следующим образом:

- она начинается с даты, представленной в виде числа
- за ней следует знак подчеркивания`'_'`
- затем идет имя файла с его расширением
- в конце строки всегда присутствует дополнительное расширение

Примеры:

```
"1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"
// возвращает "FILE_NAME.EXTENSION"

"1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34"
// возвращает "This_is_an_otherExample.mpg"

"1231231223123131_myFile.tar.gz2"
// возвращает "myFile.tar"
```