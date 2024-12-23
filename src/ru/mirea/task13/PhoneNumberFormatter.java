package ru.mirea.task13;

public class PhoneNumberFormatter {

    public static String formatPhoneNumber(String input) {
        String formattedNumber;

        // Убираем все лишние символы
        input = input.replaceAll("[^\\d+]", "");

        if (input.startsWith("+")) {
            // Если номер начинается с "+"
            String countryCode = input.substring(0, input.length() - 10);
            String localNumber = input.substring(input.length() - 10);
            formattedNumber = countryCode + " " + localNumber.substring(0, 3) + "-" +
                    localNumber.substring(3, 6) + "-" +
                    localNumber.substring(6);
        } else if (input.startsWith("8") && input.length() == 11) {
            // Для номеров России
            String localNumber = input.substring(1);
            formattedNumber = "+7 " + localNumber.substring(0, 3) + "-" +
                    localNumber.substring(3, 6) + "-" +
                    localNumber.substring(6);
        } else {
            throw new IllegalArgumentException("Неверный формат номера телефона: " + input);
        }

        return formattedNumber;
    }

    public static void main(String[] args) {
        // Пример использования
        String[] testNumbers = {"+79175655655", "89175655655", "+104289652211"};
        for (String number : testNumbers) {
            try {
                System.out.println(formatPhoneNumber(number));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
