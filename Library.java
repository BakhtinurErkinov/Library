import java.util.*;

public class Library {

    public Library() {

    }
    private Map<Integer, Book> books = new HashMap<>();
    private int nextId = 1;
    public void addBook(String title, String author) {
        Book book = new Book(nextId, title, author);
        books.put(nextId, book);
        nextId++;
    }

    public List<String> getAllBooks() {
        List<String> list = new ArrayList<>();
        for (Book title : books.values()) {
            list.add(title.getTitle());
        }
        return list;
    }
    public Book getBookById(int id) {
        return books.get(id);
    }
    public void removeBook(int id) {
        books.remove(id);
    }


}
