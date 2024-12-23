package ru.mirea.task6;

public class MainConvert {

    // Основной класс

    public static void main(String[] args) {
        // Пример температуры в Цельсиях
        double celsiusTemperature = 25.0;

        // Создаем конвертеры
        Convertable toKelvin = new CelsiusToKelvinConverter();
        Convertable toFahrenheit = new CelsiusToFahrenheitConverter();
        // Конвертация и вывод
        System.out.println("Температура в Цельсиях: " + celsiusTemperature + "°C");
        System.out.println("Температура в Кельвинах: " + toKelvin.convert(celsiusTemperature) + " K");
        System.out.println("Температура в Фаренгейтах: " + toFahrenheit.convert(celsiusTemperature) + "°F");
    }
}

