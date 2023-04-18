public class TextBook extends Book{
    private String subject;

    private String edition;
    public TextBook(String title, String author, String subject, String edition){
        super(title, author);
        this.subject = subject;
        this.edition = edition;

    }

    public String getEdition() {
        return edition;
    }

    public String getSubject() {
        return subject;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString(){
        return "Title: " + super.getTitle() + "\n" + "Author: " + super.getAuthor() +
                "\n" + "Subject: " + subject + "\n"+ "Edition: " + edition;
    }
}
