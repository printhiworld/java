import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double sum = 0;
        int [] first = {5, 2, 1, 4, 3};

        //task 1
        for (int i : first) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum);

        //task 2
        Arrays.sort(first);
        System.out.println("Минимальная сумма трат за неделю составила " + first[0]);
        System.out.println("Максимальная сумма трат за неделю составила " + first[first.length - 1]);

        //task 3
        System.out.println("Средняя сумма трат за месяц составила " + sum / first.length);

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++){
            char tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 -i];
            reverseFullName[reverseFullName.length - 1 -i] = tmp;
        }
        for (char i : reverseFullName) {
            System.out.print(i);
        }

    }
}
