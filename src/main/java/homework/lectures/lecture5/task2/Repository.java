package homework.lectures.lecture5.task2;

import java.io.IOException;
import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    Object findById(String id) throws ItemNotFoundException;

    void save(T item) throws IOException;

    void delete(String id) throws ItemNotFoundException;

}
