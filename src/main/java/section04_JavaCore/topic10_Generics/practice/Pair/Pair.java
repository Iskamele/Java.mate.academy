package section04_JavaCore.topic10_Generics.practice.Pair;

import java.util.Objects;

@SuppressWarnings("unchecked") // do not remove this line
public class Pair<I, S> {
    // fields must be private final
    // field names in this task must match getter methods
    I integerElement;
    S stringElement;

    public Pair(I integerElement, S stringElement) {
        this.integerElement = integerElement;
        this.stringElement = stringElement;
    }

    public I getKey() {
        return integerElement;
    }

    public S getValue() {
        return stringElement;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (integerElement == null ? 0 : integerElement.hashCode());
        result = 31 * result + (stringElement == null ? 0 : stringElement.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == this) {
            return true;
        }
        // this and the following comparison can be combined
        if (pair == null) {
            return false;
        }
        if (getClass() != pair.getClass()) {
            return false;
        }
        // Mentor cast Object to Pair: Pair<T, K> pair = (Pair<T, K>) obj;
        // And returned a comparison of objects using getters, checking them for null
        /*
        return (pair.getKey() == key
                || (pair.getKey() != null && pair.getKey().equals(key)))
                && (pair.getValue() == value
                || (pair.getValue() != null && pair.getValue().equals(value)));
         */
        return (Objects.equals(integerElement, ((Pair<I, S>) pair).integerElement))
                && (Objects.equals(stringElement, ((Pair<I, S>) pair).stringElement));
    }
}
