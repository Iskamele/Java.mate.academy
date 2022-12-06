package section04_JavaCore.topic08_EqualsHashcodeAndClone.master.EqualsAndHashcode;

public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object rectangle) {
        if (rectangle == this) {
            return true;
        }
        if (rectangle == null) {
            return false;
        }

        if (getClass() != rectangle.getClass()) {
            return false;
        }

        return (width == ((Rectangle) rectangle).width || width != null && width.equals(((Rectangle) rectangle).width))
                && (length == ((Rectangle) rectangle).length || length != null && length.equals(((Rectangle) rectangle).length))
                && (color == ((Rectangle) rectangle).color || color != null && color.equals(((Rectangle) rectangle).color));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
