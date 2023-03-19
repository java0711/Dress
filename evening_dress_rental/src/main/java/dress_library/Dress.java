package dress_library;

import java.util.Objects;

public class Dress {
    private Long id;
    private String color;
    private String designer;

    public Dress(String color, String designer) {
        this.color = color;
        this.designer = designer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dress dress = (Dress) o;
        return Objects.equals(color, dress.color) &&
                Objects.equals(designer, dress.designer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, designer);
    }

    @Override
    public String toString() {
        return "Dress{" +
                "color='" + color + '\'' +
                ", designer='" + designer + '\'' +
                '}';
    }
}
