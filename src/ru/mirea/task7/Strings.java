package ru.mirea.task7;

interface StringProcessor {
    int countCharacters(String s); // a) Подсчет символов в строке
    String oddPositionCharacters(String s); // b) Строка из символов на нечетных позициях
    String reverseString(String s); // c) Инвертирование строки
}

// Класс, реализующий интерфейс
class StringHandler implements StringProcessor {

    @Override
    public int countCharacters(String s) {
        return s.length(); // Возвращает длину строки
    }

    @Override
    public String oddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) { // Нечетные позиции: индексы 0, 2, 4...
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString(); // Инвертирует строку
    }
}
