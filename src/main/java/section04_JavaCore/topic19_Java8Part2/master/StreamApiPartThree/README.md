I see you are the tough one. I respect that but let's see how you will handle this. Implement the following methods of `StreamApiAdvanced` class. Be aware that in these methods you will be using objects of classes `Person` and `Cat` (each of the person objects has a list of cat objects). Don't change the signatures of the methods and don't use loops, only streams.

### Stream Api[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#stream-api)

#### Try to use minimum amount of stream operations[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#try-to-use-minimum-amount-of-stream-operations)

-   If you have a long boolean expression you may create your own implementation of Predicate and use it in your filter.
-   Where possible try to use single map operation instead of sequence of them.
-   If you need to throw exception when no result found after stream execution sometimes `get()/getAsDouble()` may help, try to google what does it do.

    #### Use Stream API to solve all tasks. Don’t use loops.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#use-stream-api-to-solve-all-tasks-dont-use-loops)

    #### Remember about the difference between bitwise and boolean operators.[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#remember-about-the-difference-between-bitwise-and-boolean-operators)

    #### Pay attention to what is a better way to compare Enum values: equals() vs == ?[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#pay-attention-to-what-is-a-better-way-to-compare-enum-values-equals-vs--)

    [Hint](https://stackoverflow.com/a/1750453)

    #### Call each new method from a new line in the stream. It will look better. For example:[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#call-each-new-method-from-a-new-line-in-the-stream-it-will-look-better-for-example)

    ```
    List<String> data = new ArrayList();
    data.stream()
          .distinct()
          .filter(x-> x.length()<5)
          .map(Integer::valueOf)
          .collect(Collectors.toList());
    ```

    #### Use constants[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#use-constants)

    Magic numbers and strings decrease code readability, let’s avoid it and use constants in class CandidateValidator


#### Use validator properly[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#use-validator-properly)

If you need to pass your custom `Predicate` implementation into filter there are two optimal solutions

```
Predicate<Candidate> customPredicate = new CustomPredicate<>();
Collection.stream()
    .filter(predicate)
    ...
```

Or:

```
Collection.stream()
        .filter(new CustomPredicate());
        ...
```

#### In method `findMinEvenNumber()` exception message should look like this:[](https://mate-academy.github.io/jv-program-common-mistakes/java-core/java-eight-part-two/stream-api#in-method-findminevennumber-exception-message-should-look-like-this)

```
"Can't get min value from list: " + numbers
```