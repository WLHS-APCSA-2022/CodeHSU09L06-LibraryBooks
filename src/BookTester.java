import java.util.ArrayList;

public class BookTester
{
    public static void main(String[] args)
    {
        // Start here!
        ArrayList<Book> bookList = new ArrayList<Book>();
        TextBook textBook1 = new TextBook("Java Programming","Joyce Farrell",
                "Computer Science", "10th");
        TextBook textBook2 = new TextBook("Practical Electronics for Inventors",
                "Scherz and Monk", "Engineering", "3rd");
        TextBook textBook3 = new TextBook("Hands-On Electronics", "Kaplan and White",
                "Engineering", "1st");

        bookList.add(textBook1);
        bookList.add(textBook2);
        bookList.add(textBook3);

        for(Book book: bookList){
            System.out.println(book);
        }

    }
}
