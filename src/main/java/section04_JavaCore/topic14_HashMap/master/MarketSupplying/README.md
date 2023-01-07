Let's work as a store accountant.

Our store is the best in the area, so we may run out of goods very quickly. We decided to order each of the units of goods, and now we are waiting for delivery.

Let's implement the method `public Map<String, Integer> supplyFruits(Map<String, Integer> storage, int supply)` which will update our stock to the actual quantity of goods.

Method parameters:

- `Map<String, Integer> storage` - the current number of products in stock.
- `int supply` - the number of units of a new product.

**Example:**
Our `storage` look like this:
```
storage = {
  "Apple" = 10,
  "Orange" = 20,
...
}
```

We ordered 10 units of each product:
```
int supply = 10;
```

Method `supplyFruits(...)` should return new `storage`:
```
storage = {
  "Apple" = 20,
  "Orange" = 30,
...
}
```