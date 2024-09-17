import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author push = new Author("alex", "push");
        Book fish = new Book("fish", push, 1888);
        fish.setYear(228);
        Author ray = new Author("ray", "aya");
        Book duna = new Book("duna", ray, 1998);
    }
}
