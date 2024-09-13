
public class Main {
    public static void main(String[] args) {

        //task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName ;
        System.out.println("Ф. И. О. сотрудника — " +fullName);

        //task 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //task 3
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace("ё", "е"));
    }
}
