package ru.mirea.task11;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String developerLastName = "Погрмоский"; // Фамилия разработчика
        Date receivedDate = new Date(); // Текущая дата и время

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + receivedDate);

        // Предположим, что сдача задания через 2 часа
        long twoHoursInMillis = 2 * 60 * 60 * 1000;
        Date submissionDate = new Date(System.currentTimeMillis() + twoHoursInMillis);

        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}
