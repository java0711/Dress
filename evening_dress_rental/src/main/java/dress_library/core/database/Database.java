package dress_library.core.database;

import dress_library.Dress;

import java.util.List;

public interface Database {

    void save(Dress dress);

    boolean deleteById(Long id);

    List<Dress> getAllDresses();

}
