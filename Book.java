import java.util.ArrayList;
import java.util.*;
public class Book {
String title;
String table;
String paragraph;
String image;
    List<String> bookContentList = new ArrayList<String>();
    public Book(String title) {
        super();
        createNewTitle(title);

    }

    public void createNewTitle(String title) {
        this.title = title;
        bookContentList.add(title);
    }

    public void createNewTable(String table) {
        this.table = table;
        bookContentList.add(table);
    }

    public void createNewParagraph(String paragraph) {
        this.paragraph = paragraph;
        bookContentList.add(paragraph);
    }

    public void createNewImage(String image) {
        this.image = image;
        bookContentList.add(image);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookContentList=" + bookContentList +
                '}';
    }
}
