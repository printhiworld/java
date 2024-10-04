import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname= surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String toString() {
        return name  + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        else if (!Objects.equals(this.getName(), ((Author) other).getName())) {
            return false;
        }
        else return Objects.equals(this.getSurname(), ((Author) other).getSurname());
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (name != null ? name.hashCode() : 0 );
        result = 31 * result + (surname != null ? surname.hashCode() : 0 );
        return result;
    }
}
