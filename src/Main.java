
import java.util.Arrays;

public class Main {
    static String string= "Ivanov Ivan Ivanovich";
    public static void main(String[] args) {

        task1(string);
        task2(string);

        String fullName = "Иванов Семён Семёнович";
        task3(fullName);


    }

    private static void task3(String string) {
        String replaced = string.replace("ё","e");
        System.out.println("Данные ФИО сотрудника — " + replaced);
    }

    private static void task2(String string) {
        String upperCaseString = string.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCaseString);
    }

    private static void task1(String string) {

        String[] strings = string.split(" ");
        String lastName = strings[0];
        String firstName = strings[1];
        String middleName = strings[2];
        String fullName = String.join(" ", strings);

        System.out.println(Arrays.toString(strings) + " added");
        System.out.println("ФИО сотрудника — " + lastName + " " + firstName + " " + middleName);
        System.out.println("ФИО сотрудника — " + fullName);
    }
}