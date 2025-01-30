public class Book {
    private String title;
    private Author author;
    private int yearOfPublished;

    public Book(String title, Author author, int yearOfPublished) {
        this.title = title;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
    }

    public Book(String title, String firstName, String lastName, int yearOfPublished) {
        this.title = title;
        this.author = new Author(firstName, lastName);
        this.yearOfPublished = yearOfPublished;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }
}