import java.time.LocalDate;

public class Main {

    public static int delivery(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return -1;
        }
        else if (deliveryDistance < 20) {
            return 1;
        }
        else if (deliveryDistance < 60) {
            return 2;
        }
        else {
            return 3;
        }
    }

    public static void app(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void yearStat(int year) {
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void main(String[] args) {

        //task 1
        int year = 2023;
        yearStat(year);

        //task 2
        int clientOS = 0;
        app(year, clientOS);

        //task 2
        int deliveryDistance = 34;
        System.out.println(delivery(deliveryDistance));
    }
}
