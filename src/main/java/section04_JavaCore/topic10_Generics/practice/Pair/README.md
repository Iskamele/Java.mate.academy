Implement the generic class `Pair` that contains a pair of elements of different types and does not prevent elements from being `null`.

Implement the `getKey()`, `getValue()`, `equals()`, and `hashCode()` methods, and also the constructor.

With a correctly implemented class `Pair`, the following code should compile and work successfully:

```
Pair<Integer, String> pair = new Pair<>(1, "hello"); Integer key = pair.getKey(); // 1 String value = pair.getValue(); // "hello" Pair<Integer, String> secondPair = new Pair<>(1, "hello"); boolean mustBeTrue = pair.equals(secondPair); // true! boolean mustAlsoBeTrue = pair.hashCode() == secondPair.hashCode(); // true!
```