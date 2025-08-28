public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Garry Potter", "Daniel Defoe");
        System.out.println(library.getAllBooks());
        System.out.println(library.getBookById(1));
        library.removeBook(1);
    }
}
