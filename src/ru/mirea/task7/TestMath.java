package ru.mirea.task7;

public class TestMath {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        // Пример возведения в степень
        double base = 2.0;
        int exponent = 3;
        System.out.println("2^3 = " + mathFunc.power(base, exponent));

        // Пример вычисления модуля комплексного числа
        double real = 3.0;
        double imaginary = 4.0;
        System.out.println("|3 + 4i| = " + mathFunc.abs(real, imaginary));

        // Пример вычисления длины окружности
        double radius = 5.0;
        System.out.println("Длина окружности с радиусом 5: " + mathFunc.circleLength(radius));
    }
}
