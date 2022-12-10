package section04_JavaCore.topic10_Generics.master.Pair;

@SuppressWarnings("unchecked")
public class Pair<T, K> {
  // field for storing the first element of a pair
  private final T key;
  // field for storing the second element of a pair
  private final K value;

  // constructor for the creation of new Pair
  public Pair(T key, K value) {
    this.key = key;
    this.value = value;
  }

  public T getKey() {
    // return the value of the first element of the pair
    return key;
  }

  public K getValue() {
    // return the value of the second element of the pair
    return value;
  }

  @Override
  public int hashCode() {
    // calculate hashcode using hashcodes of the fields of the class
    return (key == null ? 0 : key.hashCode() << 16)
      & (value == null ? 0 : value.hashCode());
  }

  @Override
  public boolean equals(Object obj) {
    // reflection check
    if (obj == this) {
      return true;
    }
    // checks for null and if classes are the same
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    // check fields of objects for equality
    Pair<T, K> pair = (Pair<T, K>) obj;
    return (pair.getKey() == key
      || (pair.getKey() != null && pair.getKey().equals(key)))
      && (pair.getValue() == value
      || (pair.getValue() != null && pair.getValue().equals(value)));
  }
}
