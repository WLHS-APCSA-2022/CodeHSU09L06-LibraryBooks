public class Novel extends Book{
    private String genre;
    private int pages;

    public Novel(String title, String author, String genre, int pages){
        super(title, author);
        this.genre = genre;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString(){
        return "Title: " + super.getTitle() + "\n" + "Author: " + super.getAuthor() + "\n" +
                "Genre: " + genre + "\n"+ "Pages: " + pages;
    }
}
