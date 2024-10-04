import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String toString() {
        return name + " " + year + " " + author.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        else if (!Objects.equals(this.getName(), ((Book) other).getName())) {
            return false;
        }
        else if (this.getYear() != ((Book) other).getYear()) {
            return false;
        }

        return this.getAuthor().equals(((Book) other).getAuthor());
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (name != null ? name.hashCode() : 0 );
        result = 31 * result + (author != null ? author.hashCode() : 0 );
        return result;
    }
}
