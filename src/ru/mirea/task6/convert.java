package ru.mirea.task6;

// Интерфейс Convertable
interface Convertable {
    double convert(double value); // Метод для конвертации температуры
}

// Класс для перевода температуры из Цельсия в Кельвины
class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15; // Формула: К = °C + 273.15
    }
}

// Класс для перевода температуры из Цельсия в Фаренгейты
class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius * 9/5 + 32; // Формула: F = °C × 9/5 + 32
    }
}



