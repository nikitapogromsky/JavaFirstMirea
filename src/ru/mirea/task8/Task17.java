package ru.mirea.task8;
import java.util.Scanner;
public class Task17 {
    // Рекурсивная функция для нахождения максимального числа
    public static int findMax() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // Чтение числа

        // Базовый случай: если число 0, возвращаем 0
        if (number == 0) {
            return 0;
        }

        // Рекурсивный вызов для оставшейся последовательности
        int maxInRest = findMax();

        // Возвращаем максимальное из текущего числа и максимума оставшейся последовательности
        return Math.max(number, maxInRest);
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел, заканчивающуюся нулем:");
        int max = findMax(); // Запускаем рекурсивную функцию
        System.out.println("Максимальное число в последовательности: " + max);
    }
}
