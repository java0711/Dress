package dress_library.core.responses;

import dress_library.Dress;

public class AddDressResponse {
    private Dress newDress;

    public AddDressResponse(Dress newDress) {
        this.newDress = newDress;
    }

    public Dress getNewDress() {
        return newDress;
    }
}
