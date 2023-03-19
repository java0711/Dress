package dress_library.core.database;

import dress_library.Dress;
import dress_library.core.database.Database;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryDatabaseImpl implements Database {
    private Long nextId = 1L;
    private List<Dress> dresses = new ArrayList<>();

    @Override
    public void save(Dress dress) {
        dress.setId(nextId);
        nextId++;
        dresses.add(dress);
    }

    @Override
    public boolean deleteById(Long id) {
        boolean isDressDeleted = false;
        Optional<Dress> dressToDeleteOpt = dresses.stream()
                .filter(dress-> dress.getId().equals(id))
                .findFirst();
        if (dressToDeleteOpt.isPresent()) {
            Dress dressToRemove = dressToDeleteOpt.get();
            isDressDeleted = dresses.remove(dressToRemove);
        }
        return isDressDeleted;
    }

    @Override
    public List<Dress> getAllDresses() {
        return dresses;
    }

}
