package MiniProjects;

public class BookL {
    private String title,author;
    private final String id;
    private int year;
    public BookL(String id, String title, String author, int year)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.year=year;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", year=" + year +
                '}';
    }

    public String getId() {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public String getAuthor()
    {
        return author;
    }
}
