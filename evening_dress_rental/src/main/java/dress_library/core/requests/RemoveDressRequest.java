package dress_library.core.requests;

public class RemoveDressRequest {

    private Long dressIdToRemove;

    public RemoveDressRequest(Long dressIdToRemove) {
        this.dressIdToRemove = dressIdToRemove;
    }

    public Long getDressIdToRemove() {
        return dressIdToRemove;
    }
}
