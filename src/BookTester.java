import java.util.ArrayList;

public class BookTester
{
    public static void main(String[] args)
    {
        // Start here!
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book textBook1 = new TextBook("Java Programming","Joyce Farrell",
                "Computer Science", "10th");
        Book textBook2 = new TextBook("Practical Electronics for Inventors",
                "Scherz and Monk", "Engineering", "3rd");
        Book textBook3 = new TextBook("Hands-On Electronics", "Kaplan and White",
                "Engineering", "1st");

        Novel ender = new Novel("Ender's Game", "Orson Scott Card", "Science Fiction", 384);
        Novel potter = new Novel("Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling", "Fantasy", 322);
        Novel maze = new Novel("The Maze Runner", "James Dashner", "Action and Adventure", 375);

        bookList.add(textBook1);
        bookList.add(textBook2);
        bookList.add(textBook3);
        bookList.add(ender);
        bookList.add(potter);
        bookList.add(maze);

        for(Book book: bookList){
            System.out.println(book);
            System.out.println();
        }

    }
}
