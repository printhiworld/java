
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
        int min = 99999;
        int max = -9999;
        for (int i : first) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min);
        System.out.println("Максимальная сумма трат за неделю составила " + max);

        //task 3
        System.out.println("Средняя сумма трат за месяц составила " + sum / first.length);

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
