
public class Main {
    public static void main(String[] args) {

        //task 1
        int vklad = 15000;
        double sum = 0;
        int month = 0;
        while (sum <2459000) {
            sum += vklad + sum * 0.1;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();

        //task 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        //task 3
        int death = 8;
        int birth = 17;
        int population = 12000000;
        for (int year = 1; year <= 10; year++){
            population += (birth - death) * (population / 1000);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //task 4
        double deposit = 15000;
        int months = 0;
        while (deposit < 12000000) {
            deposit = deposit / 100 * 107;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + deposit);

        }
        System.out.println(months);

        //task 5
        deposit = 15000;
        months = 0;
        while (deposit < 12000000) {
            deposit = deposit / 100 * 107;
            months++;
            if (months % 6 == 0)
                System.out.println("Месяц " + months + ", сумма накоплений равна " + deposit);

        }
        System.out.println(months);

        //task 6
        deposit = 15000;
        months = 0;
        while (months < (12 * 9)) {
            deposit = deposit / 100 * 107;
            months++;
            if (months % 6 == 0)
                System.out.println("Месяц " + months + ", сумма накоплений равна " + deposit);

        }

        //task 7
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        //task 8
        int year = 2024;
        for (i = year - 200; i < year + 100; i++) {
            if (i % 79 == 0){
                System.out.println(i);
            }
        }

    }

}