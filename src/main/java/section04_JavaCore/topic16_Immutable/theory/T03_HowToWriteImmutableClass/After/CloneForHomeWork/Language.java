package section04_JavaCore.topic16_Immutable.theory.T03_HowToWriteImmutableClass.After.CloneForHomeWork;

import java.util.Objects;

public class Language implements Cloneable {
    private String value;

    public Language(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Language language = (Language) o;
        return Objects.equals(value, language.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    protected Language clone() {
        return new Language(value);
    }
}
