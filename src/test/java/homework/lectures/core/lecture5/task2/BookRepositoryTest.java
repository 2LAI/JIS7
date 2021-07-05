package homework.lectures.core.lecture5.task2;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookRepositoryTest {

    private static final Logger log = Logger.getLogger(BookRepositoryTest.class);
    Book book;
    BookRepository bookRepository = new BookRepository();

    @Before
    public void setup() {
        book = new Book("1", "Alex1", "Alex1", 1);
        BookRepository.map.put(book.getId(), book);
        book = new Book("2", "Alex2", "Alex2", 2);
        BookRepository.map.put(book.getId(), book);
        book = new Book("3", "Alex3", "Alex3", 3);
        BookRepository.map.put(book.getId(), book);
    }

    @Test
    public void findById() {
        Book expected = book; //Книга №3
        Book actual = null;
        try {
            actual = bookRepository.findById("3");
        } catch (ItemNotFoundException e) {
            log.info(e.getMessage());
        }
        Assert.assertEquals(expected, actual);

        try {
            actual = bookRepository.findById("4");
        } catch (ItemNotFoundException e) {
            log.info(e.getMessage());
            Assert.assertNotNull(expected.equals(actual));
        }
    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
        try {
            bookRepository.delete("3");
            Assert.assertEquals(2, bookRepository.findAll().size());
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
    }
}