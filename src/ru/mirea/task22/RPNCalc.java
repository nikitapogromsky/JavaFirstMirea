package ru.mirea.task22;

import java.util.Stack;

public class RPNCalc {

    // Метод для вычисления выражения в обратной польской нотации
    public static double evaluateRPN(String expression) {
        // Используем стек для хранения чисел
        Stack<Double> stack = new Stack<>();

        // Разделяем выражение на элементы
        String[] tokens = expression.split(" ");

        // Проходим по каждому элементу
        for (String token : tokens) {
            // Проверяем, является ли текущий элемент числом
            if (isNumber(token)) {
                // Если это число, добавляем его в стек
                stack.push(Double.parseDouble(token));
            } else {
                // Если это оператор, извлекаем два последних числа из стека
                double b = stack.pop();
                double a = stack.pop();

                // Выполняем операцию в зависимости от оператора
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException("Недопустимый оператор: " + token);
                }
            }
        }

        // Результат вычисления будет единственным числом в стеке
        return stack.pop();
    }

    // Метод для проверки, является ли строка числом
    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Пример выражения в обратной польской нотации
        String rpnExpression = "3 4 + 2 * 7 /"; // (3 + 4) * 2 / 7

        // Вычисление результата
        double result = evaluateRPN(rpnExpression);

        // Вывод результата
        System.out.println("Результат: " + result);
    }
}