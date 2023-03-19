package dress_library.core.services;

import dress_library.Dress;
import dress_library.core.database.Database;
import dress_library.core.requests.GetAllDressesRequest;
import dress_library.core.responses.GetAllDressesResponse;

import java.util.List;

public class GetAllDressesService {
    private Database database;

    public GetAllDressesService(Database database) {
        this.database = database;
    }

    public GetAllDressesResponse execute(GetAllDressesRequest request) {
        List <Dress> dresses = database.getAllDresses();
        return new GetAllDressesResponse(dresses);
    }
}
