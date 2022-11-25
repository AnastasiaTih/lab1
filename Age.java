import java.util.Calendar;
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        do {
            System.out.println("Введите день рождения: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введено не корректное значение ");
                scanner.next();
            }
            day = scanner.nextInt();
            if (day > 31) {
                System.out.print("Введено не корректное значение ");
            }
            if (day < 1) {
                System.out.print("Введено не корректное значение ");
            }
        } while ((day > 31) || (day < 1));
        int month;
        do {
            System.out.println("Введите месяц рождения: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введено не корректное значение ");
                scanner.next();
            }
            month = scanner.nextInt();
            if (month > 12) {
                System.out.print("Введено не корректное значение ");
            }
            if (month < 1) {
                System.out.print("Введено не корректное значение ");
            }
        } while ((month > 12) || (month < 1));
        int year;
        do {
            System.out.println("Введите год рождения: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введено не корректное значение ");
                scanner.next();
            }
            year = scanner.nextInt();
            if (year > 2022) {
                System.out.print("Введено не корректное значение ");
            }
        } while (year > 2022);
        System.out.println("Ваша дата рождения " + day + "." + month + "." + year);
        int year_now = (Calendar.getInstance().get(Calendar.YEAR) - year);
        int month_now = (Calendar.getInstance().get(Calendar.MONTH) - month);
        int day_now = (Calendar.getInstance().get(Calendar.DATE) - day);
        System.out.println("Ваш возраст: " + year_now + " лет, " + month_now + " месяцев и " + year_now + " дней");
        scanner.close();
    }
}
