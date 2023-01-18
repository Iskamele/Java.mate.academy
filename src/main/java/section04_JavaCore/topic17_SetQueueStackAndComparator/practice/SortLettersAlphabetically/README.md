Implement `getUniqueCharacters(String text)` method receiving `String` with some `text` as an argument.

For this purpose use TreeSet. The text contains letters of the Latin alphabet, numbers and punctuation.

In the method you should sort all letters alphabetically and return a String of 5 different letters in lowercase without punctuation. If a text contains less than 5 unique letters, return them all.

Example 1:

```
String text = "ur-BvT?^ ra w; p"; // result should be "abprt"
```

Example 2:

```
String text = "A _f*c a?F10"; // result should be "acf"
```

#### [Try to avoid these common mistakes while solving task.](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/sort-letters)

### Common mistakes[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/sort-letters#common-mistakes)

#### Check existing methods of the `Character` class[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/sort-letters#check-existing-methods-of-the-character-class)

Class `Characters` has a lot of [methods](https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/Character.html). You can use one of them to check if a character is a letter.

#### Use StringBuilder instead of String or StringBuffer.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/sort-letters#use-stringbuilder-instead-of-string-or-stringbuffer)

Since the String object is immutable, each call for concatenation will result in a new String object being created. On the other hand, StringBuilder is mutable and thus is considered to be a very efficient way to concatenate Strings. Compiler will replace concat with StringBuilder when we have simple code row but with a loops that won’t work. [java doc](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

#### Variable naming[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/sort-letters#variable-naming)

Incorrect naming may have significant impact on your code readability!

```
Bad naming:
    char[] c;
    StringBuilder sb = new StringBuilder();
```

```
Good naming: 
    char[] lettersFromText;
    StringBuilder stringBuilder = new StringBuilder();
```