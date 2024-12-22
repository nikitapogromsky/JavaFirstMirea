package ru.mirea.task1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();

        // Создание массива и ввод его элементов
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Вычисление суммы элементов массива с использованием do-while
        int sum = 0;
        int index = 0;
        do {
            sum += array[index];
            index++;
        } while (index < size);

        // Нахождение максимального и минимального элемента массива с использованием while
        int max = array[0];
        int min = array[0];
        index = 0;
        while (index < size) {
            if (array[index] > max) {
                max = array[index];
            }
            if (array[index] < min) {
                min = array[index];
            }
            index++;
        }

        // Вывод результатов на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}

