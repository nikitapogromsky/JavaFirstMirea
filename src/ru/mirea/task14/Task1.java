package ru.mirea.task14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для разбиения на части:");
        String inputString = scanner.nextLine();

        System.out.println("Введите регулярное выражение для разбиения:");
        String regex = scanner.nextLine();

        // Разбиваем строку на части
        String[] parts = inputString.split(regex);

        // Вывод результата разбиения
        System.out.println("Результат разбиения строки:");
        for (String part : parts) {
            System.out.println(part);
        }

        scanner.close();
    }
}