package ru.mirea.task1;

public class Main2 {
    public static void main(String[] args) {
        // Проверка, есть ли аргументы командной строки
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не были переданы.");
        } else {
            System.out.println("Аргументы командной строки:");
            // Вывод каждого аргумента в цикле for
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
