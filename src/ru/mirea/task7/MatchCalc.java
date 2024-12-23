package ru.mirea.task7;

interface MathCalculable {
    double PI = 3.141592653589793; // Константа PI

    // Метод для возведения в степень
    double power(double base, int exponent);

    // Метод для вычисления модуля комплексного числа
    double abs(double real, double imaginary);
}

// Класс MathFunc, реализующий интерфейс MathCalculable
class MathFunc implements MathCalculable {
    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent); // Используем метод Math.pow
    }

    @Override
    public double abs(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary); // Формула: √(real^2 + imaginary^2)
    }

    // Метод для вычисления длины окружности
    public double circleLength(double radius) {
        return 2 * PI * radius; // Формула: 2 * PI * R
    }
}