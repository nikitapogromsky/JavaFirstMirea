package ru.mirea.task8;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Чтение натурального числа
        int sum = sumOfDigits(n); // Вычисление суммы цифр
        System.out.println(sum); // Вывод результата
    }

    // Рекурсивный метод для подсчета суммы цифр числа
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Базовый случай: если число 0, сумма цифр равна 0
        }
        return n % 10 + sumOfDigits(n / 10); // Последняя цифра + рекурсия для оставшейся части числа
    }
}