package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Регулярное выражение для проверки строки
        String regex = "^abcdefghijklmnopqrstuvwxyz18340$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Введите строку для проверки:");
        String input = scanner.nextLine();

        // Проверка строки на соответствие
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Строка корректна.");
        } else {
            System.out.println("Строка некорректна.");
        }

        scanner.close();
    }
}