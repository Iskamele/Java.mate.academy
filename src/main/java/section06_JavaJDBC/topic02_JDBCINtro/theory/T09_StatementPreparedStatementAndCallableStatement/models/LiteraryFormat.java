package section06_JavaJDBC.topic02_JDBCINtro.theory.T09_StatementPreparedStatementAndCallableStatement.models;

public class LiteraryFormat {
    private Long id;
    public String format;

    public LiteraryFormat() {
    }

    public LiteraryFormat(String s) {
    }

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
