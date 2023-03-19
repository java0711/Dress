package dress_library.core.services;

import dress_library.Dress;
import dress_library.core.database.Database;
import dress_library.core.requests.AddDressRequest;
import dress_library.core.responses.AddDressResponse;

public class AddDressService {
    private Database database;

    public AddDressService(Database database) {
        this.database = database;
    }

    public AddDressResponse execute(AddDressRequest request) {
        Dress dress = new Dress(request.getColor(), request.getDesigner());
        database.save(dress);
        return  new AddDressResponse (dress);
    }

}
