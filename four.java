import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points;
        do {
            System.out.print("Введите количество точек: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не корректное значение: ");
                scanner.next();
            }
            points = scanner.nextInt();
            if (points <= 0) {
                System.out.println("Введено отрицательное значение: ");
            }
        } while (points <= 0);
        int r;
        do {
            System.out.print("Введите радиус окружности: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введено не корректное значение: ");
                scanner.next();
            }
            r  = scanner.nextInt();
            if (r <= 0) {
                System.out.println("Введено отрицательное значение: ");
            }
        } while (r <= 0);
        int pointsInCircle = 0;
        for (int i = 1; i <= points; i++) {
            System.out.println("X" + i + "точки: ");
            double x = scanner.nextDouble();
            System.out.println("Y" + i + "точки: ");
            double y = scanner.nextDouble();
            if (x*x+y*y <= r*r) {
                pointsInCircle++;
            }
        }
        System.out.println(pointsInCircle + " точек вошли в окружность");
        scanner.close();
    }
}