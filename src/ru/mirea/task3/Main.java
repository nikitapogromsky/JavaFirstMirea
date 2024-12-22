package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        double[] array1 = new double[size];
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100;
        }
        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Отсортированный массив с использованием Math.random(): " + Arrays.toString(array1));
        Random random = new Random();
        double[] array2 = new double[size];
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;}
        System.out.println("Массив с использованием класса Random: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Отсортированный массив с использованием класса Random: " + Arrays.toString(array2));
    }
}