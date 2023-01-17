package section04_JavaCore.topic16_Immutable.theory.T03_HowToWriteImmutableClass.After;

public class Language {
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
}
