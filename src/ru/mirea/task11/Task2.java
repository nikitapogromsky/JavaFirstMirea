package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Введите дату в формате dd-MM-yyyy:");
        String inputDateStr = scanner.nextLine();

        try {
            Date inputDate = dateFormat.parse(inputDateStr);
            Date currentDate = new Date();

            System.out.println("Текущая дата: " + dateFormat.format(currentDate));
            System.out.println("Введённая дата: " + dateFormat.format(inputDate));

            if (inputDate.before(currentDate)) {
                System.out.println("Введённая дата раньше текущей.");
            } else if (inputDate.after(currentDate)) {
                System.out.println("Введённая дата позже текущей.");
            } else {
                System.out.println("Введённая дата совпадает с текущей.");
            }
        } catch (ParseException e) {
            System.out.println("Неверный формат даты! Попробуйте снова.");
        }
    }
}
