
public class Main {
    public static void main(String[] args) {
        Author push = new Author("alex", "alex");
        Book fish = new Book("fish", push, 1888);
        fish.setYear(228);
        Author ray = new Author("alex", "alex");
        Book duna = new Book("duna", ray, 1998);
        System.out.println("duna.toString() = " + duna);
        System.out.println("push.equals(ray) = " + push.equals(ray));
        System.out.println("duna.toString() = " + duna.equals(fish));
        System.out.println(ray.hashCode());
        System.out.println(fish.hashCode());
    }
}
