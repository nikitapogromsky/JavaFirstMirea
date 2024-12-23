package ru.mirea.task7;

public class TestString {
    public static void main(String[] args) {
        StringHandler stringHandler = new StringHandler();

        String testString = "Hello, World!";

        // a) Подсчет символов
        System.out.println("Количество символов: " + stringHandler.countCharacters(testString));

        // b) Символы на нечетных позициях
        System.out.println("Символы на нечетных позициях: " + stringHandler.oddPositionCharacters(testString));

        // c) Инвертирование строки
        System.out.println("Инвертированная строка: " + stringHandler.reverseString(testString));
    }
}
