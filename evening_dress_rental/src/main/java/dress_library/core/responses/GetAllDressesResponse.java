package dress_library.core.responses;

import dress_library.Dress;

import java.util.List;

public class GetAllDressesResponse {

    private List<Dress> dresses;

    public GetAllDressesResponse(List<Dress> dresses) {
        this.dresses = dresses;
    }

    public List<Dress> getDresses() {
        return dresses;
    }
}
