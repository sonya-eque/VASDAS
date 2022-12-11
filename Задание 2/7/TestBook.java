import java.util.ArrayList;
public class TestBook {
    public static void main(String[] args) {
        BookShelf.bookList.add(new Book("Charlz Dickens", "Great hopes", 1862));
        BookShelf.bookList.add(new Book("Oskar Wilde", "Grey", 1876));
        BookShelf.bookList.add(new Book("Agata Christie", "Piglets", 1950));
        BookShelf.bookList.add(new Book("William Shakespeare", "Othello", 1589));
        BookShelf.sortBooks();
        System.out.println(BookShelf.bookList);
    }
}