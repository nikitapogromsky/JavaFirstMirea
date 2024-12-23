package ru.mirea.task8;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // Счетчик числа 1
        boolean stopCounting = false; // Флаг для остановки подсчета

        while (true) {
            int num = scanner.nextInt(); // Чтение числа

            if (num == 0) {
                int nextNum = scanner.nextInt(); // Чтение следующего числа
                if (nextNum == 0) {
                    break; // Если подряд два нуля — завершить ввод
                } else {
                    if (!stopCounting) {
                        stopCounting = true; // Игнорируем числа после двух нулей
                    }
                }
            } else {
                if (!stopCounting && num == 1) {
                    count++; // Увеличиваем счетчик, если встречается число 1
                }
            }
        }

        System.out.println(count); // Вывод результата
    }
}
