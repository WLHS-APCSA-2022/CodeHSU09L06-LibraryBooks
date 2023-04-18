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

    @Override
    public String toString(){
        return super.toString() + "\n" + "Subject: " + subject + "\n"+ "Edition: " + edition;
    }
}
