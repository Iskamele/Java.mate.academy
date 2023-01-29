Implement the suitable functional interface and override its method that should take two `Integer` values that represent powers of the two engines, and return the difference between them as `Integer` as well.

#### [Try to avoid these common mistakes while solving task.](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight/functional-interfaces)


### Common mistakes[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight/functional-interfaces#common-mistakes)

#### Don’t rush to create your own functional interfaces[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight/functional-interfaces#dont-rush-to-create-your-own-functional-interfaces)

There are several functional interfaces that already exist in Java. Try to find the behavior that you need among the [existing ones](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html).

#### Don’t use magic numbers in your code[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight/functional-interfaces#dont-use-magic-numbers-in-your-code)

Your code should be easy to read. Move all hardcoded values to [constant fields](https://mate-academy.github.io/style-guides/java/java.html#s5.2.4-constant-names) and give them informative names.

#### Don’t complicate if-else construction. [Detailed explanation.](https://www.youtube.com/watch?v=P-UmyrbGjwE&list=PL7FuXFaDeEX1smwnp-9ri8DBpgdo7Msu2)[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight/functional-interfaces#dont-complicate-if-else-construction-detailed-explanation)

#### Don’t use hardcode where you need to return random values[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight/functional-interfaces#dont-use-hardcode-where-you-need-to-return-random-values)

Try using methods of the `java.util.Random` class instead.

#### Don’t create redundant variables.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight/functional-interfaces#dont-create-redundant-variables)

Redundant variables are somewhat similar to commented code. They are confusing and make your code less clean and much more difficult to read. Not to mention they occupy stack memory.