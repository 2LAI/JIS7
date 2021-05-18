package homework.lectures.lecture5.task2;

import homework.lectures.lecture5.task1.ProductDemo;
import lombok.SneakyThrows;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class BookRepositoryDemo {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Logger log = Logger.getLogger(ProductDemo.class);
    static BookRepository bookRepository = new BookRepository();

    public static void main(String[] args) throws IOException, ItemNotFoundException {
        startDemo();
    }

    @SneakyThrows
    private static void startDemo() {
        createAndSave();
        createAndSave();
        showAllBooks();
        bookIdNumberOne();
        bookRepository.delete("1");
        showAllBooks();
    }

    private static Book create() throws IOException {

        Book book = new Book();
        log.info("Введите id книги: ");
        book.setId(reader.readLine());
        log.info("Введите имя книги: ");
        book.setName(reader.readLine());
        log.info("Введите автора книги: ");
        book.setAuthor(reader.readLine());
        log.info("Введите количество страниц в книге: ");

        book.setPagesCount(Integer.parseInt(reader.readLine()));
        return book;
    }

    private static void bookIdNumberOne() throws ItemNotFoundException {
        log.info("Книга под индексом 1: ");
        Book book1 = bookRepository.findById("1");
        log.info(book1);
    }

    private static void showAllBooks() {
        log.info("Все книги: ");
        List<Book> list = bookRepository.findAll();
        log.info(list);
    }

    private static void createAndSave() throws IOException {
        Book book = create();
        bookRepository.save(book);
        log.info("Книга " + book.getName() + " была сохранена\n\r");
    }
}
