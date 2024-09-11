//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task 1
        int first = 1;
        byte second = 2;
        short third = 3;
        long fourth = 4;
        float fifth = 5.1F;
        double sixth = 6.2;
        System.out.println("Значение переменной first с типом int равно " + first);
        System.out.println("Значение переменной second с типом byte равно " + second);
        System.out.println("Значение переменной third с типом short равно " + third);
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        System.out.println("Значение переменной sixth с типом double равно " + sixth);

        //task 2
        double one = 27.12;
        long two = 987678965549L;
        double three = 2.786;
        int four = 569;
        int five = -159;
        int six = 27897;
        int seven = 67;

        //task 3
        first = 23;
        second = 27;
        third = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/(first + second + third) + " листов бумаги");

        //task 4
        int speed = 16;
        speed *= 10;
        System.out.println("За 20 минут машина произвела " + speed + " штук бутылок");
        speed *= 3 * 24;
        System.out.println("За сутки, машина произвела " + speed + " штук бутылок");
        speed *= 3 ;
        System.out.println("За 3 дня, машина произвела " + speed + " штук бутылок");
        speed *= 10;
        System.out.println("За месяц, машина произвела " + speed + " штук бутылок");

        //task 5
        int paint = 120;
        System.out.println("В школе, где " + paint / 6 + " классов, нужно " + paint / 3  + " банок белой краски и " + paint / 3 * 2 + " банок коричневой краски");

        //task 6
        double banana = 0.08;
        double milk = 0.105;
        double ice = 0.1;
        double egg = 0.07;
        System.out.println((banana * 5 + milk * 2 + ice * 2 + egg * 4) * 1000);
        System.out.println((banana * 5 + milk * 2 + ice * 2 + egg * 4));

        //task 7
        first = 7000;
        System.out.println(first / 250);
        System.out.println(first / 500);

        //task 8
        int masha = 67760;
        int den = 83690;
        int crist = 76230;
        System.out.println("Маша теперь получает " + (masha / 100 * 110) + " рублей. Годовой доход вырос на " + (masha / 100 * 10 * 12) + " рублей");
        System.out.println("denis теперь получает " + (den / 100 * 110) + " рублей. Годовой доход вырос на " + (den / 100 * 10 * 12) + " рублей");
        System.out.println("kristina теперь получает " + (crist / 100 * 110) + " рублей. Годовой доход вырос на " + (crist / 100 * 10 * 12) + " рублей");
    }

}