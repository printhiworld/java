import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //task 1
        boolean isIOS = true;
        if (isIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 2
        int clientDeviceYear = console.nextInt();
        if (clientDeviceYear < 2015 && isIOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= 2015 && isIOS) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 3
        int year = console.nextInt();
        if (year <= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //task 4
        int deliveryDistance = console.nextInt();
        if (deliveryDistance > 100) {
            System.out.println("доставки нет");
        }
        else if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        else {
            System.out.println("Потребуется дней: 3");
        }

        //task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case  1, 2, 12:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
            default:
                break;
        }



    }

}