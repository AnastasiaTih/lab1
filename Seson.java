import java.util.Scanner;

public class Seson {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int day;
            do {
                System.out.println("Введите день: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введено не корректное значение ");
                    scanner.next();
                }
                day = scanner.nextInt();
                if (day > 31) {
                    System.out.println("Введено не корректное значение ");
                }
                if (day <= 0) {
                    System.out.println("Введено не корректное значение ");
                }
            } while ((day <= 0) || (day > 31));
            int month;
            do {
                System.out.println("Введите месяц: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Введено не корректное значение ");
                    scanner.next();
                }
                month = scanner.nextInt();
                if (month > 12) {
                    System.out.println("Введено не корректное значение ");
                }
                if (month <= 0) {
                    System.out.println("Введено не корректное значение ");
                }
            } while ((month <= 0) || (month > 12));
            if (month == 1 || month == 2 || month == 12) {
                System.out.println("Зима");
            }
            if (month == 3 || month == 4 || month == 5) {
                System.out.println("Весна");
            }
            if (month == 6 || month == 7 || month == 8) {
                System.out.println("Лето");
            }
            if (month == 9 || month == 10 || month == 11) {
                System.out.println("Осень");
            }
            scanner.close();
        }
}
