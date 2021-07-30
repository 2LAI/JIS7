package homework.lectures.core.lecture5.task2;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {
    public static Map<String, Book> map = new HashMap<>();
    private static final Logger log = Logger.getLogger(BookRepository.class);

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        for (Map.Entry<String, Book> stringBookEntry : map.entrySet()
        ) {
            bookList.add(stringBookEntry.getValue());
        }
        return bookList;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        Book book;
        if (map.containsKey(id))
            book = map.get(id);
        else {
            throw new ItemNotFoundException("ID не найден" + id);
        }
        return book;
    }

    @Override
    public void save(Book item) {
        map.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (!id.isEmpty()) {
            if (map.containsKey(id)) {
                map.remove(id);
            } else
                throw new ItemNotFoundException("Такой id не найден:\n " + id);
        } else
            throw new ItemNotFoundException("Вы не ввели id:\n " + id);
        log.info("Книга с " + id + " была удалена");
    }

}
