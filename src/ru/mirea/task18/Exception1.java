package ru.mirea.task18;

public class Exception1 {
    public void exceptionDemo() {
        try {
            // Попытка выполнить деление на ноль
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            // Обработка исключения
            System.out.println("Attempted division by zero");
        }

        // Демонстрация деления чисел с плавающей точкой
        System.out.println("2.0 / 0.0 = " + (2.0 / 0.0));
        System.out.println("0.0 / 0.0 = " + (0.0 / 0.0)); // Вернет NaN (Not a Number)
    }

    public static void main(String[] args) {
        // Создание экземпляра класса и вызов метода
        Exception1 exception = new Exception1();
        exception.exceptionDemo();
    }
}