import java.util.Scanner;

public class three{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Введите число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не корректное значение ");
                scanner.next();
            }
            x = scanner.nextInt();
            if (x <= 0) {
                System.out.println("Введено отрицательное значение ");
            }
        } while (x <= 0);
        int n;
        do {
            System.out.println("Введите число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не корректное значение ");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n < -15 || n > 15) {
                System.out.println("Повторите ввод данных");
            }
        }
            while (n < -15 || n > 15);
            double result = 1;
            if (n >=0) {
                for (int i = 0; i < n; i++) {
                    result *= x;
                }
            }
            else {
                for (int i = 0; i > n; i--) {
                    result /= x;
                }
            }
            System.out.println(result);
            scanner.close();
    }
}