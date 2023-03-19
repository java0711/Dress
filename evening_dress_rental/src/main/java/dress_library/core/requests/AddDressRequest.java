package dress_library.core.requests;

public class AddDressRequest {
    private String color;
    private String designer;

    public AddDressRequest(String color, String designer) {
        this.color = color;
        this.designer = designer;
    }

    public String getColor() {
        return color;
    }

    public String getDesigner() {
        return designer;
    }
}
