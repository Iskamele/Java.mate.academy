Implement all methods in the `Stack` class.

Your implementation should be based on an array, or a singly linked list (don't use existing collections).

Throw `EmptyStackException` where needed.

#### [Try to avoid these common mistakes while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack)

### Common mistakes[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#common-mistakes)

#### Don’t use magic numbers in the code[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#dont-use-magic-numbers-in-the-code)

Your code should be easy to read. Move all hardcoded values to [constant fields](https://mate-academy.github.io/style-guides/java/java.html#s5.2.4-constant-names) and give them informative names.

#### Don’t use getters and setters in class Node[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#dont-use-getters-and-setters-in-class-node)

We have access to private fields of inner class, so using getters or setters is redundant.

#### Parameterize Node class[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#parameterize-node-class)

Class `Node` takes a value, so we should parameterize it to prevent problems with data types.

#### Don’t use public access modifiers everywhere[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#dont-use-public-access-modifiers-everywhere)

If the method has only a utility purpose and is used only inside the same class, it should not be `public`. Keep your code as close as possible to follow the encapsulation principle.

#### Avoid default access modifiers[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#avoid-default-access-modifiers)

All fields and methods should have access modifiers. Remember about the encapsulation principle.

#### Variable naming[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#variable-naming)

Incorrect naming may have significant impact on your code readability!

```
Bad naming:
    T[] a;
```

```
Good naming: 
    T[] stack;
```

#### If your implementation is based on an array, use annotation `@SuppressWarnings("unchecked")` if test is failed with error: `uses unchecked or unsafe operations`[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/stack#if-your-implementation-is-based-on-an-array-use-annotation-suppresswarningsunchecked-if-test-is-failed-with-error-uses-unchecked-or-unsafe-operations)

Suppressing the warning with @SuppressWarnings(“unchecked”) tells the compiler that the programmer believes the code to be safe and won’t cause unexpected exceptions.

```
Example:
@SuppressWarnings("unchecked")
public class Stack<T> {
}
```