package dress_library.core.services;

import dress_library.core.database.Database;
import dress_library.core.requests.RemoveDressRequest;
import dress_library.core.responses.RemoveDressResponse;

public class RemoveDressService {
    private Database database;

    public RemoveDressService(Database database) {
        this.database = database;
    }

    public RemoveDressResponse execute(RemoveDressRequest request) {
        boolean isDressRemoved = database.deleteById(request.getDressIdToRemove());
        return new RemoveDressResponse (isDressRemoved);
    }

}

