package section06_JavaJDBC.topic04_INNERJOIN.T03_ManytoOneInsertExample.model;

public class LiteraryFormat {
    private Long id;
    public String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LiteraryFormat{" +
                "id=" + id +
                ", format='" + format + '\'' +
                '}';
    }
}
