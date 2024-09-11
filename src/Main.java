import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //task 1
        for(int i = 1; i < 11; i++){
            System.out.println( i);
        }
        System.out.println("\n");


        //task 2
        for(int i = 10; i > 0; i--){
            System.out.println( i);
        }
        System.out.println("\n");

        //task 3
        for(int i = 2; i < 17; i += 2){
            System.out.println( i);
        }
        System.out.println("\n");

        //task 4
        for(int i = 10; i > -11; i--){
            System.out.println( i);
        }
        System.out.println("\n");

        //task 5
        for(int i = 1904; i < 2100; i+=4){
            System.out.println(i + " год является високосным");
        }
        System.out.println("\n");
        //task 6
        for(int i = 7; i < 105; i+=7){
            System.out.println( i);
        }
        System.out.println("\n");

        //task 7
        for(int i = 1; i < 513; i*=2){
            System.out.println( i);
        }
        System.out.println("\n");
        //task 8
        int sum = 0;
        for(int i = 1; i <= 12; i++){
            sum += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("\n");

        //task 9
        int sum9 = 0;
        for(int i = 1; i <= 12; i++){
            sum9 += 29000 + sum9 * 0.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum9 + " рублей");
        }
        System.out.println("\n");

        //task 10
        for(int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + (2 * i));
        }
        System.out.println("\n");


    }

}