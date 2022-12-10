package section04_JavaCore.topic10_Generics.practice.Pair;

import java.util.Objects;

@SuppressWarnings("unchecked") // do not remove this line
public class Pair<I, S> {
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
        if (pair == null) {
            return false;
        }
        if (getClass() != pair.getClass()) {
            return false;
        }
        return (Objects.equals(integerElement, ((Pair<?, ?>) pair).integerElement))
                && (Objects.equals(stringElement, ((Pair<?, ?>) pair).stringElement));
        /*
        return (Objects.equals(integerElement, ((Pair) pair).integerElement))
                && (Objects.equals(stringElement, ((Pair) pair).stringElement));
         */
        /*
        return (integerElement == ((Pair) pair).integerElement || integerElement != null && integerElement.equals(((Pair) pair).integerElement))
                && (stringElement == ((Pair) pair).stringElement || stringElement != null && stringElement.equals(((Pair) pair).stringElement));
        */
    }
}
