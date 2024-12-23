package ru.mirea.task19;

import java.util.Scanner;

// Пользовательское исключение для недействительного ИНН
class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}

public class OnlineBuy {

    // Метод проверки ИНН
    public static void validateINN(String inn) throws InvalidINNException {
        if (inn.length() != 12 || !inn.matches("\\d+")) {
            throw new InvalidINNException("Недействительный ИНН: ИНН должен состоять из 12 цифр.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Запрашиваем у пользователя ФИО
            System.out.print("Введите ваше ФИО: ");
            String fullName = scanner.nextLine();

            // Запрашиваем у пользователя ИНН
            System.out.print("Введите ваш ИНН: ");
            String inn = scanner.nextLine();

            // Проверяем ИНН
            validateINN(inn);

            // Если ошибок нет
            System.out.println("Спасибо, " + fullName + "! Ваш ИНН (" + inn + ") действителен.");
        } catch (InvalidINNException e) {
            // Обрабатываем исключение для недействительного ИНН
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена.");
        }
    }
}
