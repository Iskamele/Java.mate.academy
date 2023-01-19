Implement a method that computes the symmetric difference of two sets.

The result should be a new set.

Example: the symmetric difference of the sets `{1, 2, 3}` and `{0, 1, 2}` is `{0, 3}`.

This task must be solved without loops. Also, note that **you shouldn't modify the input sets** - create and modify their copies instead.

#### [Try to avoid these common mistakes while solving task.](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/symmetric-difference)



### Common mistakes[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/symmetric-difference#common-mistakes)

#### Check existing methods of the `Set` interface[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/symmetric-difference#check-existing-methods-of-the-set-interface)

Interface `Set` has a lot of [methods](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html). It is better to use existing methods, if possible, than to create your own.

#### Don’t copy `Set` using loops[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/symmetric-difference#dont-copy-set-using-loops)

A lot of `Set` implementations have a constructor that takes Collection as a parameter. So we can use this constructor to initialize a `Set` with data from other collection.

#### Use abstract reference instead of more specific one:[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/set-queue-stack-comparator/symmetric-difference#use-abstract-reference-instead-of-more-specific-one)

```
Bad example:
    HashSet set = new HashSet();
```

This example is bad cause it won’t allow us to use polymorphism in our code.

```
Improved example:
    Set set = new HashSet();
```