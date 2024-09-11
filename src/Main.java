import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //task 1
        int age = console.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        //task 2
        int temp = console.nextInt();
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        //task 3
        int speed = console.nextInt();
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        }

        else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        //task 4
        int age4 = console.nextInt();
        if (age4 >= 2 && age4 < 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        }
        else if ( age4 < 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        }
        else if (age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу");
        }

        //task 5
        int age5 = console.nextInt();
        if (age5 < 5) {
            System.out.println("Если возраст человека равен " + age5 + ", то он не может кататься на аттракционе");
        }
        else if (age5 < 14) {
            System.out.println("Если возраст человека равен " + age5 + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else {
            System.out.println("Если возраст человека равен " + age5 + ", то он может кататься без сопровождения взрослого");
        }

        //task 6
        int seat = console.nextInt();
        if (seat < 60) {
            System.out.println("take a sit");
        }
        else if (seat < 102) {
            System.out.println("forced to stand");
        }
        else {
            System.out.println("wait for the next train");
        }

        //task 7
        int one = console.nextInt();
        System.out.println("one more");
        int two = console.nextInt();
        System.out.println("and the last one");
        int three = console.nextInt();
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }

}