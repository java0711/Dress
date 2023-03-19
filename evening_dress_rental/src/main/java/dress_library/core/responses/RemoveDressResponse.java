package dress_library.core.responses;

public class RemoveDressResponse {

    private boolean dressRemoved;

    public RemoveDressResponse(boolean dressRemoved) {
        this.dressRemoved = dressRemoved;
    }

    public boolean isDressRemoved() {
        return dressRemoved;
    }
}
