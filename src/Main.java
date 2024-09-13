import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 1
        int [] first = new int [3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double [] second = {1.57, 7.654, 9.986};
        int[] third = {3, 2, 1};

        //task 2
        System.out.println("task 2");
        for (int i = 0; i < first.length; i++){
            if (i == 2) {
                System.out.println(first[i]);
            }
            else {
                System.out.print(first[i] + ", ");
            }
        }
        for (int i = 0; i < second.length; i++){
            if (i == 2) {
                System.out.println(second[i]);
            }
            else {
                System.out.print(second[i] + ", ");
            }
        }
        for (int i = 0; i < third.length; i++){
            if (i == 2) {
                System.out.println(third[i]);
            }
            else {
                System.out.print(third[i] + ", ");
            }
        }

        //task 3
        System.out.println("\ntask 3");
        for (int i = first.length - 1; i >= 0; i--){
            if (i == 0) {
                System.out.println(first[i]);
            }
            else {
                System.out.print(first[i] + ", ");
            }
        }
        for (int i = second.length - 1; i >= 0; i--){
            if (i == 0) {
                System.out.println(second[i]);
            }
            else {
                System.out.print(second[i] + ", ");
            }
        }
        for (int i = third.length - 1; i >= 0; i--){
            if (i == 0) {
                System.out.println(third[i]);
            }
            else {
                System.out.print(third[i] + ", ");
            }
        }

        //task 4
        System.out.println("\ntask 4");
        for (int i = 0; i < first.length; i++){
            if (first[i] % 2 != 0){
                first[i] += 1;
            }
        }
        System.out.println(Arrays.toString(first));

    }
}
