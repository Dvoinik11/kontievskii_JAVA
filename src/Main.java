import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1-я задача
        First();

        // 2-я задача
        Second();

        // 3-я задача
        Third();
    }

    // Класс для решения первой задачи
    public static void First() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b==0) {
            System.out.println("Деление на 0 невозможно");
        } else {
            System.out.println("a / b = " + (double) a / b);
        }
    }

    // Класс для решения второй задачи
    public static void Second() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    // Класс для решения третьей задачи
    public static void Third() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Четные числа массива: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
