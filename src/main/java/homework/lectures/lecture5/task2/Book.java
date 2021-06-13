package homework.lectures.lecture5.task2;

import java.util.Objects;

public class Book {
    private String id;
    private String name;
    private String author;
    private int pagesCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesCount == book.pagesCount && Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public Book(String id, String name, String author, int pagesCount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public Book() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, pagesCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }
}
